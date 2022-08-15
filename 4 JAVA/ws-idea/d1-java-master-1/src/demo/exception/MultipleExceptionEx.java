package demo.exception;

public class MultipleExceptionEx {
	public static void main(String[] args) {
		test2();
	}
	public static void test2() {

//		java.lang.ArithmeticException: / by zero
		int num = 10;
		int num1 = 10;
		int result = 0 ;
		try {
			Test test = null;
			test.testMe();
		 result = num / num1;
		 System.err.println(result);
		}
		catch (ArithmeticException arithmeticException) {
			System.err.println("Please enter a valid number");
		}
		catch (NullPointerException nullPointerException) {
			System.err.println("Please instantiate");
			System.err.println(nullPointerException.getMessage());
			System.err.println(nullPointerException);
			System.err.println(nullPointerException.getClass());
			System.err.println(nullPointerException.getClass().getName());
		}
		System.err.println("Done");
	}
}

class Test {
	public void testMe() {
		System.err.println("testMe()");
	}
}