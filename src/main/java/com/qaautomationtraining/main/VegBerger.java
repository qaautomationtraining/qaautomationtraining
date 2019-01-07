package com.qaautomationtraining.main;
import org.junit.Test;

public class VegBerger extends Burger {
	
	@Override
	public void price() {
		System.out.println("Price is $4.00");
	}

	@Test
	public void test() {
		packing();
		price();
	}
	
}