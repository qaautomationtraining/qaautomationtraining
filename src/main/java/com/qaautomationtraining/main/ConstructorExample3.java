package com.qaautomationtraining.main;

public class ConstructorExample3 {
	int id;
	String name;

	public ConstructorExample3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ConstructorExample3 ce1 = new ConstructorExample3(1, "Karim");
		ConstructorExample3 ce2 = new ConstructorExample3(2, "Atish");
		ce1.display();
		ce2.display();
	}

}
