package demo.oops;

public class OverloadingEx {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
//		calculator.sum(5, 5, 5, 5);
		calculator.sum(5, 5);
		calculator.sum(5, 5,5);
		calculator.sum(5.5f, 5.5f);
	}
}
 class Calculator {
	 // function overloading // multiple methods with same name but different arguments
	 public void sum(int num1, int num2) {
			System.err.println(num1 + num2);
		}
		public void sum(int num1, int num2, int num3) {
			System.err.println(num1 + num2 + num3);
		}
		public void sum(float num1, float num2) {
			System.err.println(num1 + num2);
		}
 }