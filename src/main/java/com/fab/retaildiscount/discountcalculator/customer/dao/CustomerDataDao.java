package com.fab.retaildiscount.discountcalculator.customer.dao;

import org.springframework.data.repository.CrudRepository;

import com.fab.retaildiscount.discountcalculator.customer.vo.Customer;

public interface CustomerDataDao{

		public Customer findByCustomerId(String customerID);
	}
