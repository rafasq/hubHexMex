package com.exception;

import java.util.Scanner;

public class MultipleExceptionSingleCatchEx {
	public static void main(String[] args) {
		test2();
	}
	public static void test2() {

//		java.lang.ArithmeticException: / by zero
		int num = 10;
		int num1 = 0;
		int result = 0;
		try {
			Test1 test = new Test1() ;
			test.testMe();
			result = num / num1;
			System.err.println(result);
		} catch (ArithmeticException | NullPointerException exception) {
			Class classObject = exception.getClass();
			String className = classObject.getSimpleName();
			if (className.equals("ArithmeticException")) {
				System.err.println("Please enter a valid number");
			} else if (className.equals("NullPointerException")) {
				System.err.println("Please instantiate");
			}
		}
		System.err.println("Done");
	}
}

class Test1 {
	public void testMe() {
		System.err.println("testMe()");
	}
}