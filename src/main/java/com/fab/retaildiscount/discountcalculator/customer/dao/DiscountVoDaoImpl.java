package com.fab.retaildiscount.discountcalculator.customer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fab.retaildiscount.discountcalculator.customer.vo.Customer;
import com.fab.retaildiscount.discountcalculator.util.ValidateUtil;

@Component
public class DiscountVoDaoImpl implements DiscountVoDao {
	@Autowired
	ValidateUtil validateUtil;

	 /**
	   * fetch customer details depend on customer id  .
	   * @param CustomerVo its a Customer details.
	   * @param dTotal its a grand total excluding grocery.
	   * @return discount amount.
	   *If the user is an employee of the store, he gets a 30% discount
		If the user is an affiliate of the store, he gets a 10% discount
		If the user has been a customer for over 2 years, he gets a 5% discount. 
		If the customer does not fall in any of the above then 0
	   */
	@Override
	public double calculateDiscountForCustomer(Customer CustomerVo, double dTotal) {
		// TODO Auto-generated method stub
		double dTotDiscount = 0;
		if (validateUtil.pNullCheck.test(CustomerVo)) {

			if (validateUtil.pEmployee.test(CustomerVo)) {
				dTotDiscount = dTotal * 30 / 100;
			} else if (validateUtil.pAffiliate.test(CustomerVo)) {
				dTotDiscount = dTotal * 20 / 100;
			} else if (validateUtil.hasyearGreaterThan2(CustomerVo)) {
				dTotDiscount = dTotal * 5 / 100;
			} else {
				dTotDiscount = 0;
			}

		}

		return dTotDiscount;
	}

	 /**
	   * fetch customer details depend on customer id  .
	   * @param dTotal after customer discount + grocery
	   * For every $100 on the bill, there would be a $ 5 discount
	   */
	@Override
	public double calculateDiscountOnbillAmount(double dTotal) {
		// TODO Auto-generated method stub
		int occurance = (int) dTotal / 100;
		return occurance * 5;

	}

}
