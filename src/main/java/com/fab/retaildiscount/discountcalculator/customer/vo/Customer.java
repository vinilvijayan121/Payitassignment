package com.fab.retaildiscount.discountcalculator.customer.vo;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7968105649952450018L;

	@Id
	@GeneratedValue
	private int id;

	@Column(name = "FIRST_NAME")
	private String sFirstName;

	@Column(name = "LAST_NAME")
	private String sLastName;

	@Column(name = "CUSTOMER_ID")
	private String sCustomerId;

	@Column(name = "CUSTOMER_TYPE")
	private int iCustomerType;

	@Column(name = "JOINING_DATE")
	private Timestamp tJoiningDate;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String sFirstName, String sLastName, String sCustomerId, int iCustomerType,
			Timestamp tJoiningDate) {
		super();
		this.id = id;
		this.sFirstName = sFirstName;
		this.sLastName = sLastName;
		this.sCustomerId = sCustomerId;
		this.iCustomerType = iCustomerType;
		this.tJoiningDate = tJoiningDate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + sFirstName + ", lastName=" + sLastName + ", customerId="
				+ sCustomerId + ", customerType=" + iCustomerType + ", joiningDate=" + tJoiningDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getsFirstName() {
		return sFirstName;
	}

	public void setsFirstName(String sFirstName) {
		this.sFirstName = sFirstName;
	}

	public String getsLastName() {
		return sLastName;
	}

	public void setsLastName(String sLastName) {
		this.sLastName = sLastName;
	}

	public String getsCustomerId() {
		return sCustomerId;
	}

	public void setsCustomerId(String sCustomerId) {
		this.sCustomerId = sCustomerId;
	}

	public int getiCustomerType() {
		return iCustomerType;
	}

	public void setiCustomerType(int iCustomerType) {
		this.iCustomerType = iCustomerType;
	}

	public Timestamp gettJoiningDate() {
		return tJoiningDate;
	}

	public void settJoiningDate(Timestamp tJoiningDate) {
		this.tJoiningDate = tJoiningDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
