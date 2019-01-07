package com.qaautomationtraining.main;

public class ConstructorExample2 {
	static int count=0;
	ConstructorExample2(){
		count++;
		System.out.println(count);
	}
	
	public static void main(String args[]) {
		ConstructorExample2 ce1 = new ConstructorExample2();
		ConstructorExample2 ce2 = new ConstructorExample2();
		ConstructorExample2 ce3 = new ConstructorExample2();	
	}
}