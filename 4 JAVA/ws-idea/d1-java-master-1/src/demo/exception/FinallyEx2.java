package demo.exception;

import java.util.Scanner;

public class FinallyEx2 {
	public static void main(String[] args) {
		test2();
	}
	public static void test2() {
//		java.lang.ArithmeticException: / by zero
		int num = 10;
		int num1 = 0;
		int result = 0 ;
		try {
		 result = num / num1;
		 System.err.println(result);
		}
		catch (ArithmeticException arithmeticException) {
			System.err.println("Please enter a valid number");
		}
		finally {
			num = num1 = 0;
			System.out.println("clean up...");
		}
		System.err.println("done");
	}
}
