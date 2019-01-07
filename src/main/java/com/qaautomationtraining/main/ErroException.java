package com.qaautomationtraining.main;

public class ErroException {

	public static void main(String args[]) {
		try {
			int k=50/0;	
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println("rest of the code...");
	}
}