package com.fab.retaildiscount.discountcalculator.util;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Predicate;


import org.springframework.stereotype.Component;

import com.fab.retaildiscount.discountcalculator.customer.vo.Customer;
import com.fab.retaildiscount.discountcalculator.enums.Level;

@Component
public class ValidateUtil {
	
	public Predicate<Object> pNullCheck=object->object!=null;
	
	public Predicate<Double> pAmountCheck=amount->amount>0;

	
	public Predicate<Customer> pEmployee=user->user.getiCustomerType()==Level.EMPLOYEE.getLevelCode();
	
	public Predicate<Customer> pAffiliate=user->user.getiCustomerType()==Level.AFFILIATE.getLevelCode();
	

	public  boolean hasyearGreaterThan2(Customer customer) {
		LocalDate now = LocalDate.now();
		Date dt = customer.gettJoiningDate();
		LocalDate joinDate = dt.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return joinDate.isBefore(now.minusYears(2));
	}
	

}
