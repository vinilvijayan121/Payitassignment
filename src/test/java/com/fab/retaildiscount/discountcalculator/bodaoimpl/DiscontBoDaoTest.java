package com.fab.retaildiscount.discountcalculator.bodaoimpl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.fab.retaildiscount.discountcalculator.DiscountcalculatorApplication;
import com.fab.retaildiscount.discountcalculator.customer.dao.DiscountBoDaoImpl;
import com.fab.retaildiscount.discountcalculator.customer.vo.BillVo;
import com.fab.retaildiscount.discountcalculator.customer.vo.ItemVo;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=DiscountcalculatorApplication.class)
public class DiscontBoDaoTest {
	
	@Autowired
	DiscountBoDaoImpl discountBoDaoImpl;

	@Test
	public void testcaseForEmployee() {
		
		List<ItemVo> items=new ArrayList<ItemVo>();
		
		ItemVo itemVo=new ItemVo();
		itemVo.setdSellingPrice(150);
		itemVo.setSkuType("E");
		itemVo.setQuantity(1);
		items.add(itemVo);
		
		//fail("Not yet implemented");
		BillVo billBo=new BillVo();
		billBo.setdAmount(150);
		billBo.setsBillnumber("1001");
		billBo.setsCustomerId("vinil@gmail.com");
		billBo.setItemVo(items);
		double actual=discountBoDaoImpl.calculateDiscountbySellingprice(billBo);
		if(actual==100){
			assertTrue(true);
		}else{
			assertFalse(true);
		}
		
	}
	
	@Test
	public void testcaseForAffiliate() {
		
		List<ItemVo> items=new ArrayList<ItemVo>();
		
		ItemVo itemVo=new ItemVo();
		itemVo.setdSellingPrice(150);
		itemVo.setSkuType("E");
		itemVo.setQuantity(1);
		items.add(itemVo);
		
		//fail("Not yet implemented");
		BillVo billBo=new BillVo();
		billBo.setdAmount(150);
		billBo.setsBillnumber("1001");
		billBo.setsCustomerId("testone@gmail.com");
		billBo.setItemVo(items);
		double actual=discountBoDaoImpl.calculateDiscountbySellingprice(billBo);
		if(actual==115){
			assertTrue(true);
		}else{
			assertFalse(true);
		}
		
	}
	
	
	@Test
	public void testcaseForYearMoreThan2() {
		
		List<ItemVo> items=new ArrayList<ItemVo>();
		
		ItemVo itemVo=new ItemVo();
		itemVo.setdSellingPrice(150);
		itemVo.setSkuType("E");
		itemVo.setQuantity(1);
		items.add(itemVo);
		
		//fail("Not yet implemented");
		BillVo billBo=new BillVo();
		billBo.setdAmount(150);
		billBo.setsBillnumber("1001");
		billBo.setsCustomerId("testtwo@gmail.com");
		billBo.setItemVo(items);
		double actual=discountBoDaoImpl.calculateDiscountbySellingprice(billBo);
		if(actual==137.5){
			assertTrue(true);
		}else{
			assertFalse(true);
		}
		
	}
	
	@Test
	public void testcaseForGrocery() {
		
		List<ItemVo> items=new ArrayList<ItemVo>();
		
		ItemVo itemVo=new ItemVo();
		itemVo.setdSellingPrice(150);
		itemVo.setSkuType("G");
		itemVo.setQuantity(1);
		items.add(itemVo);
		
		//fail("Not yet implemented");
		BillVo billBo=new BillVo();
		billBo.setdAmount(150);
		billBo.setsBillnumber("1001");
		billBo.setsCustomerId("testtwo@gmail.com");
		billBo.setItemVo(items);
		double actual=discountBoDaoImpl.calculateDiscountbySellingprice(billBo);
		if(actual==145){
			assertTrue(true);
		}else{
			assertFalse(true);
		}
		
	}
	
	@Test
	public void testcaseForGroceryMoreThan2Items() {
		
		List<ItemVo> items=new ArrayList<ItemVo>();
		
		ItemVo itemVo=new ItemVo();
		itemVo.setdSellingPrice(150);
		itemVo.setSkuType("G");
		itemVo.setQuantity(1);
		items.add(itemVo);
		
		ItemVo itemVo1=new ItemVo();
		itemVo1.setdSellingPrice(150);
		itemVo1.setSkuType("E");
		itemVo1.setQuantity(1);
		items.add(itemVo1);
		
		//fail("Not yet implemented");
		BillVo billBo=new BillVo();
		billBo.setdAmount(300);
		billBo.setsBillnumber("1001");
		billBo.setsCustomerId("testtwo@gmail.com");
		billBo.setItemVo(items);
		double actual=discountBoDaoImpl.calculateDiscountbySellingprice(billBo);
		if(actual==282.5){
			assertTrue(true);
		}else{
			assertFalse(true);
		}
		
	}

}
