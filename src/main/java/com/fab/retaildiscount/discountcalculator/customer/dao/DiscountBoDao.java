package com.fab.retaildiscount.discountcalculator.customer.dao;


import com.fab.retaildiscount.discountcalculator.customer.vo.BillVo;
import com.fab.retaildiscount.discountcalculator.customer.vo.ItemVo;

public interface DiscountBoDao {
	
	public double calculateDiscountbySellingprice(BillVo billVo);

}
