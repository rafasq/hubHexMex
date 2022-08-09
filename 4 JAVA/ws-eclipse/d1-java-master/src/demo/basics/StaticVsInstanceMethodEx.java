package demo.basics;

public class StaticVsInstanceMethodEx {
	public static void main(String[] args) {
		testStaticMethod();

//	new keyword is used to create instance
		StaticVsInstanceMethodEx object = new StaticVsInstanceMethodEx();
		object.testInstanceMethod();
	}

	public static void testStaticMethod() {
		System.err.println("static method");
	}

	public void testInstanceMethod() {
		System.err.println("instance method");

	}

}
