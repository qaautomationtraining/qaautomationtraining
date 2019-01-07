package com.qaautomationtraining.main;

public class ConstructorExample1 {
	int count=0;
	ConstructorExample1(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		ConstructorExample1 ce1 = new ConstructorExample1();
		ConstructorExample1 ce2 = new ConstructorExample1();
		ConstructorExample1 ce3 = new ConstructorExample1();	
	}
}