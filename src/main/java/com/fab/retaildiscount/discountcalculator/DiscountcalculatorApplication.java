package com.fab.retaildiscount.discountcalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class DiscountcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscountcalculatorApplication.class, args);
	}

}
