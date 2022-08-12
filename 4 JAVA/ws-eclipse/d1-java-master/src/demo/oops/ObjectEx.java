package demo.oops;

public class ObjectEx {
	public static void main(String[] args) {
		Object object = new Object();
		String objectString = object.toString();
		System.err.println(objectString);

		Product product = new Product();
		String productString = product.toString();
		System.err.println(productString);
		System.err.println(product.toString());
		System.err.println(product);
	}
}

class Product extends Object {
//class Product {
	String name = "Pen";
	int price = 5;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name " + name + " Price " + price;
	}
}