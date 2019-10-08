package com.fab.retaildiscount.discountcalculator.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fab.retaildiscount.discountcalculator.customer.dao.DiscountBoDao;
import com.fab.retaildiscount.discountcalculator.customer.vo.BillVo;



@RestController
public class RetailDiscountController {
	@Autowired
	DiscountBoDao discountBoDao;

	/**
	   * to check system is working.
	   * @return Good morning message
	   */
	@GetMapping("/test")
	public String getdiscount(){
		return "Good morning";
	}
	
	 /**
	   * to calculate the store discount .
	   * @param billVo its a request object contains items,customer id and selling price
	   * @return net payable amount
	   */
	@PostMapping(value = "/discount")
	public ResponseEntity<String> applyDiscount(@RequestBody BillVo billVo) {

		double discount = discountBoDao.calculateDiscountbySellingprice(billVo);
		return new ResponseEntity<>(String.valueOf(discount), HttpStatus.OK);

	}

}
