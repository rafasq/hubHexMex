package demo.oops;

public class ConstructorOverloadingEx {
	public static void main(String[] args) {
		Shape square = new Shape();
		square.area();
		Shape rectangle = new Shape(4,2);
		rectangle.area();
	}
}

class Shape {

//	instance variable
	int length, breadth;

// same name of class
// default constructor / no parameter
// to initialize the object
	public Shape() {
		length = 2;
		breadth = 2;
	}
// parameterized cons
	public Shape(int pLength, int pBreadth) {
		length = pLength;
		breadth = pBreadth;
	}
	
	public void area() {
		System.err.println(length * breadth);
	}
}