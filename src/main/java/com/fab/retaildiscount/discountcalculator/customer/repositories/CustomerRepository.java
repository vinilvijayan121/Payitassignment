package com.fab.retaildiscount.discountcalculator.customer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fab.retaildiscount.discountcalculator.customer.vo.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

	public Customer findBysCustomerId(String customerID);
}
