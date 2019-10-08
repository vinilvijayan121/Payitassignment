package com.fab.retaildiscount.discountcalculator.customer.vo;

import java.util.List;

public class BillVo {
	private String sBillnumber;
	private String sCustomerId;
	private double dAmount;
	List<ItemVo> itemVo;
	public String getsBillnumber() {
		return sBillnumber;
	}
	public void setsBillnumber(String sBillnumber) {
		this.sBillnumber = sBillnumber;
	}

	public String getsCustomerId() {
		return sCustomerId;
	}
	public void setsCustomerId(String sCustomerId) {
		this.sCustomerId = sCustomerId;
	}
	public double getdAmount() {
		return dAmount;
	}
	public void setdAmount(double dAmount) {
		this.dAmount = dAmount;
	}
	public List<ItemVo> getItemVo() {
		return itemVo;
	}
	public void setItemVo(List<ItemVo> itemVo) {
		this.itemVo = itemVo;
	}

	
}
