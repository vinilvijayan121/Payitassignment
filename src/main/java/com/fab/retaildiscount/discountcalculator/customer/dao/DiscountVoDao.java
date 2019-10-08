package com.fab.retaildiscount.discountcalculator.customer.dao;

import com.fab.retaildiscount.discountcalculator.customer.vo.Customer;

public interface DiscountVoDao {
	
	public double calculateDiscountForCustomer(Customer CustomerVo,double dTotal);
	
	public double calculateDiscountOnbillAmount(double dTotal);

}
