package demo.basics;

public class StringVsStringBufferVsStringBuilderEx {
	public static void main(String[] args) {
		String msgString = "Hard work.";
		String msgString1 = new String("Smart work.");
		StringBuffer stringBuffer = new StringBuffer("Passionate work.");
		StringBuilder stringBuilder = new StringBuilder("Happy work.");
		System.err.println(msgString);
		System.err.println(msgString1);
		System.err.println(stringBuffer);
		System.err.println(stringBuilder);
	}
}
