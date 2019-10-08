package com.fab.retaildiscount.discountcalculator.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fab.retaildiscount.discountcalculator.customer.vo.BillVo;
import com.fab.retaildiscount.discountcalculator.customer.vo.Customer;
import com.fab.retaildiscount.discountcalculator.customer.vo.ItemVo;
import com.fab.retaildiscount.discountcalculator.util.ValidateUtil;

@Service
public class DiscountBoDaoImpl implements DiscountBoDao {

	@Autowired
	ValidateUtil validateUtil;

	@Autowired
	CustomerDataDaoImpl customerDataDao;

	@Autowired
	DiscountVoDaoImpl discountVoDao;

	@Override
	public double calculateDiscountbySellingprice(BillVo BillVo) {

		// validate given input object not null using predicate
		if (validateUtil.pNullCheck.test(BillVo)) {

			double dNetTotal = 0;
			double dNetGrocery = 0;
			double dTotalDiscount = 0;
			double dTotalAmt=BillVo.getdAmount();

			if (BillVo.getItemVo() != null && BillVo.getItemVo().size() > 0) {

				List<ItemVo> list = BillVo.getItemVo();

				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getSkuType().equals("G")) {
						dNetGrocery = dNetGrocery + list.get(i).getdSellingPrice();
					} else {
						dNetTotal = dNetTotal+list.get(i).getdSellingPrice();
					}
				}

			}

			if (validateUtil.pAmountCheck.test(dNetTotal)) {
				if (validateUtil.pNullCheck.test(BillVo.getsCustomerId())) {
					Customer CustomerVo = customerDataDao.findByCustomerId(BillVo.getsCustomerId());
					dTotalDiscount = discountVoDao.calculateDiscountForCustomer(CustomerVo, dNetTotal);
					dNetTotal = dNetTotal - dTotalDiscount;
				}
			}
			dNetTotal=dNetTotal+dNetGrocery;
			
			if (validateUtil.pAmountCheck.test(dNetTotal)) {
					
					dTotalDiscount = dTotalDiscount + discountVoDao.calculateDiscountOnbillAmount(dNetTotal);
			}
			
			if(dTotalDiscount>0){
				return dTotalAmt-dTotalDiscount;
				
			}

			return dTotalAmt;

		}

		return 0;
	}

}
