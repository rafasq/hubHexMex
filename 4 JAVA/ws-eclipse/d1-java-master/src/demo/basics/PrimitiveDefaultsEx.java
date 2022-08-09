package demo.basics;
public class PrimitiveDefaultsEx {
//	initialized by default
//	byte bvar;
//	short shortvar;
//	int intvar;
//	long longvar;
//	float floatvar;
//	double doublevar;
//	char charvar;
//	boolean booleanvar;
	byte bvar = 1;
	short shortvar = 2;
	int intvar = 3;
	long longvar = 4;
	float floatvar = 5.5f;
	double doublevar = 6.6d;
	char charvar = 'a';
	boolean booleanvar = false;

	public static void main(String[] args) {
		PrimitiveDefaultsEx object = new PrimitiveDefaultsEx();
		System.err.println(object.bvar);
		System.err.println(object.shortvar);
		System.err.println(object.intvar);
		System.err.println(object.longvar);
		System.err.println(object.floatvar);
		System.err.println(object.doublevar);
		System.err.println(object.charvar);
//		"\u0000" "null character"
		System.err.println(object.booleanvar);
		method();
	}

	public static void method() {
		byte bvar = 10;
		System.err.println(bvar);
	}
}
