package com;

public class Operations {

	int result;

	public void addition(int a, int b) {
		this.result = a + b;
		System.out.println("The result of summation the number " + a + " and number " + b + " is: " + result);

	}

	public void subtraction(int a, int b) {
		this.result = a - b;
		System.out.println("The result of subtraction the number " + a + " and number " + b + " is: " + result);

	}

	public void multiplication(int a, int b) {
		this.result = a * b;
		System.out.println("The result of multiplication the number " + a + " and number " + b + " is: " + result);

	}

	public void division(int a, int b) {
		this.result = a / b;
		System.out.println("The result of division the number " + a + " and number " + b + " is: " + result);

	}
}
