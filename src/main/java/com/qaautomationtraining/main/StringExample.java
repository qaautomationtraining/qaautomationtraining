package com.qaautomationtraining.main;

public class StringExample {

	public static void main(String[] args) {
		String x = "Hello;Java";
		String y = " HELLO JAVA  ";
		String z = "HELLO;JAVA";
		
		System.out.println(x.charAt(6));
		System.out.println(x.contains("kamal"));
		System.out.println(x.equals("Hello Java"));
		System.out.println(y.equalsIgnoreCase(x));
		System.out.println(x.isEmpty());
		System.out.println(x.replace("Java", "C#"));
		String[] parts = x.split(";");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		System.out.println(y.substring(1, 5));
		System.out.println(y.trim());
		System.out.println(x.toUpperCase().equals(z));
		System.out.println(x.equals(z.toLowerCase()));
		
	}
}