package demo.exception;

import java.util.Scanner;

public class UnhandledExceptionEx {
	public static void main(String[] args) {
		test1();
//		test2();
	}
	public static void test2() {
//		java.lang.ArithmeticException: / by zero
		int num = 10;
		int num1 = 0;
		int result = num / num1;
		System.err.println(result);
	}
	public static void test1() {
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
}
