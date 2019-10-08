package com.fab.retaildiscount.discountcalculator.customer.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fab.retaildiscount.discountcalculator.customer.repositories.CustomerRepository;
import com.fab.retaildiscount.discountcalculator.customer.vo.Customer;


@Service
public class CustomerDataDaoImpl implements CustomerDataDao{
	@Autowired
	private CustomerRepository customerRepository;

	 /**
	   * fetch customer details depend on customer id  .
	   * @param customerID its a customer unique id.
	   * @return Customer details.
	   *
	   */
	@Override
	public Customer findByCustomerId(String customerID) {
		// TODO Auto-generated method stub
		return customerRepository.findBysCustomerId(customerID);
	}

}
