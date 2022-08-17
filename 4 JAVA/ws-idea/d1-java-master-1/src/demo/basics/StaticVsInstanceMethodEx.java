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
	public static String staticVar = "static var";
//	public  String instanceVar = "instance var";
	public static void testStaticMethod() {
		System.err.println("static method");
		System.out.println(staticVar);
//		System.out.println(instanceVar);
	}
}
class TestInstance {
	public  String instanceVar = "instance var";
	public void testInstanceMethod() {
		System.err.println("instance method");
		System.out.println(instanceVar);
	}
}