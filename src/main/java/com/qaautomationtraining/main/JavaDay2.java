package com.qaautomationtraining.main;

import java.util.regex.Pattern;

public class JavaDay2 {

	public static void main(String[] args) {
		getWhile();
		getDoWhile();
		getBreak();
		getContinue();
		getRegEx();
	}

	//RegEx
	private static void getRegEx() {
		System.out.println("Pattern Matches "+ Pattern.matches("[a-zA-Z0-9]{8}", "kamal12"));
	}

	//Break
	private static void getContinue() {
		for (int k = 0; k < 10; k++) {
			if (k == 5) {
				continue;
			} else {
				System.out.println("value of k " + k);
			}
		}
	}

	//Break
	private static void getBreak() {
		for (int k = 0; k < 10; k++) {
			if (k == 5) {
				break;
			} else {
				System.out.println("value of k " + k);
			}
		}
	}

	// Do While Loop
	private static void getDoWhile() {
		int j = 0;
		do {
			System.out.println("Value of J is " + j);
			j++;
		} while (j < 5);
	}

	// While Loop
	private static void getWhile() {
		int i = 0;
		while (i < 10) {
			System.out.println("Value of i is " + i);
			i = i + 2;
		}
	}
}