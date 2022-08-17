package com.exception;

import java.util.Scanner;

public class NumberFormatExceptionEx2 {
	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.err.println("Enter no : 1");
			// 20 = "20"
			String numString = scanner.nextLine();
			int num = Integer.parseInt(numString);
			System.err.println("Enter no : 2");
			String numString1 = scanner.nextLine();
			int num1 = Integer.parseInt(numString1);
			int result = num / num1;
			System.err.println(result);
		}
		catch (NumberFormatException	numberFormatException) {
			System.err.println("Please enter a valid number " + numberFormatException);
		}

		System.err.println("done");
	}

}
