package demo.oops;

public class AbstractClassEx {
	public static void main(String[] args) {
		Mobile mobileObject = null;
//		Cannot instantiate the type Mobile
//		mobileObject = new Mobile();
//		base class object points to derived class instance.
		mobileObject = new SmartPhone();
		mobileObject.calling();
		mobileObject.texting();
		mobileObject.fm();
	}
}
// used for inheritance.
abstract class Mobile {
	static final String internalMemorySize = "8 gb";
// abstract method without body
	public abstract void calling();

	public abstract void texting();

	public void fm() {
		System.out.println("98.3 fm");
	}
}

class SmartPhone extends Mobile {
	@Override
	public void calling() {
		System.out.println("Call by entering the number on touchscreen");
	}
	@Override
	public void texting() {
	System.out.println("Text using whats app.");
		
	}
}