package com.exception;

import java.util.Scanner;

public class ThrowEx {
	public static void main(String[] args) {
		// calling func
		try {
			test2();
		} catch (Exception exception) {
			String messageString = exception.getMessage();
			System.err.println(messageString);
		}
		System.err.println("main done");
	}
	
//	called func
	public static void test2() throws Exception {
//		java.lang.ArithmeticException: / by zero
		int num = 10;
		int num1 = -1;
		int result = 0 ;
		if(num < 0 || num1 < 0) {
			Exception exception = new Exception("num cannot be -ve");
			throw exception;
		}
		 result = num / num1;
		 System.err.println(result);
		System.err.println("done");
	}
}
