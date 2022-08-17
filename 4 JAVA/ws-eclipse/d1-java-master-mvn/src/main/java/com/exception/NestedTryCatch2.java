package com.exception;

import java.util.Scanner;

public class NestedTryCatch2 {
	public static void main(String[] args) {
		test2();
	}
	public static void test2() {

//		java.lang.ArithmeticException: / by zero
		int num = 10;
		int num1 = 0;
		int result = 0 ;
		try {
			Test2 test = new Test2();
			test.testMe();
			try {
			 result = num / num1;
			 System.err.println(result);
			}
			catch (ArithmeticException arithmeticException) {
				System.err.println("Please enter a valid number");
			}
			System.err.println("after inner try");
		}

		catch (NullPointerException nullPointerException) {
			System.err.println("Please instantiate");
		}
		System.err.println("Done");
	}
}

class Test2 {
	public void testMe() {
		System.err.println("testMe()");
	}
}