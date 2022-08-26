package demo.basics;
public class PrimitiveDataTypes {

	
	public static void main(String[] args) {
		// by default 50.50 is double
		double d = 50.50;
		System.err.println("Main");
//		call method
		printPrimitiveDetails();
//		printPrimitiveDetails();
	}

	// create method
	public static void printPrimitiveDetails() {
		System.out.println("Primitive Data Types");
		System.err.println("****************");
		System.err.println("type \tminval \tmaxval \tsize");
		System.err.print("byte \t");
		System.err.print(Byte.MIN_VALUE + "\t");
		System.err.print(Byte.MAX_VALUE + "\t");
		System.err.println(Byte.SIZE);
//		IP : print the type min and max size.
		System.err.print("short \t");
		System.err.print(Short.MIN_VALUE + "\t");
		System.err.print(Short.MAX_VALUE + "\t");
		System.err.println(Short.SIZE);

		System.err.print("int \t");
		System.err.print(Integer.MIN_VALUE + "\t");
		System.err.print(Integer.MAX_VALUE + "\t");
		System.err.println(Integer.SIZE);

		System.err.print("float \t");
		System.err.print(Float.MIN_VALUE + "\t");
		System.err.print(Float.MAX_VALUE + "\t");
		System.err.println(Float.SIZE);

		System.err.print("long \t");
		System.err.print(Long.MIN_VALUE + "\t");
		System.err.print(Long.MAX_VALUE + "\t");
		System.err.println(Long.SIZE);

		System.err.print("double \t");
		System.err.print(Double.MIN_VALUE + "\t");
		System.err.print(Double.MAX_VALUE + "\t");
		System.err.println(Double.SIZE);

		System.err.print("char \t");
		System.err.print((int) Character.MIN_VALUE + "\t");
//		\uFFFF
		System.err.print((int) Character.MAX_VALUE + "\t");
		System.err.println(Character.SIZE);

		System.err.print("boolean \t");
		System.err.print(Boolean.FALSE + "\t");
		System.err.println(Boolean.TRUE + "\t");
	}
}
