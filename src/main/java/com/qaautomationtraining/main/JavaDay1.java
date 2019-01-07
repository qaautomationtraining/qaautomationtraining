package com.qaautomationtraining.main;

public class JavaDay1 {
	int x = 1; // Instanse Variable
	static int y = 2; // Static Variable

	// Main Method
	public static void main(String[] args) {
		int z = 3;
		System.out.println("Static Variable " + y);
		System.out.println("Local Variable " + z);
		getOperator(5, 6, 7);
		getSwitch(1);
		getForLoop();
	}

	// For Loop
	private static void getForLoop() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

	// Switch Case
	private static void getSwitch(int i) {
		switch (i) {
		case 1:
			System.out.println("Value is Kamal");
			break;
		case 2:
			System.out.println("Value is Salman");
			break;
		default:
			System.out.println("Value is Not Found");
			break;
		}
	}

	// Operators
	private static void getOperator(int i, int j, int k) {
		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		if ((i > j || i < k) && j < k) {
			System.out.println(i > j && i < k);
		} else {
			System.out.println(i > j | i < k);
		}
	}

}