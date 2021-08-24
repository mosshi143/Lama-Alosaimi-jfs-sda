package com;

import java.util.*;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choice the number of the desired operation");
		System.out.println("1 --> Summation");
		System.out.println("2 --> Subtraction");
		System.out.println("3 --> Multiplication");
		System.out.println("4 --> Division");

		Operations operation = new Operations();
		double a = 12.5;
		double b = 6.5;

		int c = (int) a;// type casting
		int d = (int) b;
		String CaseNum = scanner.nextLine();
		switch (CaseNum) {
		case "1":
			operation.addition(c, d);
			break;
		case "2":
			operation.subtraction(c, d);
			break;
		case "3":
			operation.multiplication(c, d);
			break;
		case "4":
			operation.division(c, d);
			break;
		}

	}

}
