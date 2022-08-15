package demo.exception;

public class ErrorEx {
	public static void main(String[] args) {
		// java.lang.StackOverflowError
		recursionOutOfControl();
	}

	public static void recursionOutOfControl() {
		while (true) {
//			System.out.println("Crazy Loop");
			recursionOutOfControl();
		}
	}

}
