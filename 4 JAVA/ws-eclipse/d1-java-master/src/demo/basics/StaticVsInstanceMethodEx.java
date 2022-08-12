package demo.basics;

public class StaticVsInstanceMethodEx {
	public static void main(String[] args) {
		TestStatic.testStaticMethod();
//	new keyword is used to create instance
		TestInstance object = new TestInstance();
		object.testInstanceMethod();
	}



}

class TestStatic {
	public static void testStaticMethod() {
		System.err.println("static method");
	}
}

class TestInstance {
	public void testInstanceMethod() {
		System.err.println("instance method");

	}
}