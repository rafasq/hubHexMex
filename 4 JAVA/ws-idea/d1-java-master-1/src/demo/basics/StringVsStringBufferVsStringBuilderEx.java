package demo.basics;

public class StringVsStringBufferVsStringBuilderEx {
	public static void main(String[] args) {
		stringMethods();
//		waysToCreateStrings();
//		concatString();
//		concatStringBuilder();
	}
	private static void stringMethods() {
String message = "All is well!";
		System.out.println(message.endsWith("!"));
		System.out.println(message.indexOf("well"));
		System.out.println(message.indexOf("l"));
		System.out.println(message.lastIndexOf("l"));
		System.out.println(message.length());
		String subString = message.substring(7,11);
		System.out.println(subString);
	}
	private static void concatString() {
		System.out.println("String...");
		long startTime;
		String testString = "";
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 50001; i ++ ) {
			testString = testString +i ;
		}
		System.out.println(System.currentTimeMillis() - startTime);
//		System.out.println(testString);
	}
	private static void concatStringBuilder() {
		System.out.println("StringBuilder...");
		long startTime;
		StringBuilder stringBuilder = new StringBuilder();
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 50001; i ++ ) {
			stringBuilder.append(i);
		}
		System.out.println(System.currentTimeMillis() - startTime);
//		System.out.println(stringBuilder);
	}

	private static void waysToCreateStrings() {
//		inside string pool
		String msgString = "Hard work.";
//		inside heap
		String msgString1 = new String("Smart work.");
		//		inside heap
		StringBuffer stringBuffer = new StringBuffer("Passionate work.");
		//		inside heap
		StringBuilder stringBuilder = new StringBuilder("Happy work.");
		System.err.println(msgString);
		System.err.println(msgString1);
		System.err.println(stringBuffer);
		System.err.println(stringBuilder);
	}
}
