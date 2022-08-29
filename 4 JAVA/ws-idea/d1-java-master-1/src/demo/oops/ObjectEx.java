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
// garbage collection
//	@Override
//	protected void finalize() throws Throwable {
//		super.finalize();
//	}
// multi-threading
	//	public final void wait()
//			throws InterruptedException
//	{
//
//	}
//	multi-threading
//public final void notify(){
//
//}
	@Override
public int hashCode()
{

}
@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name " + name + " Price " + price;
	}

}