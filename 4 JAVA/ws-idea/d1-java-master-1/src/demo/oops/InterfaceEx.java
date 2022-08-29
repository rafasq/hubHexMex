package demo.oops;
// RELATIONSHIPS
// class _______________ class / extends
// abstract class _______ class / extends
// interface ________ interface / extends
// class ___________ interface / implements
// interface ________ class / no relationship

// ERROR
// class implements class
// interface implements interface
// interface extends class
// class extends interface
// abstract class cannot be instantiated

public class InterfaceEx {
	public static void main(String[] args) {
		Mobile1 mobileObject = null;
//		Cannot instantiate the type Mobile
//		mobileObject = new Mobile1();
//		base class object points to derived class instance.
		mobileObject = new SmartPhone1();
		mobileObject.calling();
		mobileObject.texting();
	}
}

// used for implementation.
interface Mobile1 {
	static final String internalMemorySize = "8 gb";

// abstract method without body
//	public abstract void calling();
	void calling();
	public abstract void texting();

	// cannot have a method with body
//	public void fm() {
//		System.out.println("98.3 fm");
//	}
}
// Animals > Aquatic
// Animals >Terrestrial
// Flyer fly() > Ball, Bird, Rocket
class SmartPhone1 implements Mobile1 {
	@Override
	public void calling() {
		System.out.println("Call by entering the number on touchscreen");
	}

	@Override // annotation
	public void texting() {
		System.out.println("Text using whats app.");
	}
//	@Override
	public void youtube() {
		System.out.println("watch youtube");
	}
}
// class implement interface
interface TestInterface {
//	default public in interface
// BY DEFAULT PUBLIC
	void testMethod();
}
// class implements interface
class TestClass implements  TestInterface {
	// DEFAULT ACCESS
	// @Override
	//  void testMethod() {
	// }
		@Override
	public void testMethod() {
	}
}


// class _________ class / extends
// class ________ interface / implements
// interface ________ interface / extends
// interface  ________  class / nothing like that


//interface
// interface cannot extend class
// interface can extend interface
// interface cannot implement interface
// class cannot interface
class TestClass1 {}
//interface Test5 extends TestClass1{
//
//}

interface i1 {}
interface i2 extends i1{}
//interface i2 implement i1{}

class Vehicle {

}
// Car IS-A a Vehcle
// THE INHERITANCE  = IS-A relationship
class Car extends Vehicle {

}