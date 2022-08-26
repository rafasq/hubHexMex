package demo.basics;

public class VariableTypesLocalVariableEx {
//	static method
	public static void main(String[] args) {
		VariableTypesLocalVariableEx objectVariable = new VariableTypesLocalVariableEx();
		objectVariable.test();
	}

// test is the method
// instance method / non static method
	public void test() {
		// local variable / declared inside method
		int x = 100;
		System.err.println(x);
	}
// instance
	int y;
//	static
	static int yy;
}

class Test5 {
//	constructor / same name of class
	Test5() {
//	local /declared inside constructor
		int x = 500;
	}
}
