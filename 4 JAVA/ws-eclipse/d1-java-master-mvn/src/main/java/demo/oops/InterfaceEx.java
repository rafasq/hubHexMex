package demo.oops;

public class InterfaceEx {
	public static void main(String[] args) {
		Mobile1 mobileObject = null;
//		Cannot instantiate the type Mobile
//		mobileObject = new Mobile1();
//		base class object points to derived class instance.
//		mobileObject = new SmartPhone1();
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

//class SmartPhone1 implements Mobile1 {
//	@Override
//	public void calling() {
//		System.out.println("Call by entering the number on touchscreen");
//	}

//	@Override // annotation
//	public void texting() {
//		System.out.println("Text using whats app.");
//	}
//	@Override
//	public void youtube() {
//		System.out.println("watch youtube");
//	}
//}