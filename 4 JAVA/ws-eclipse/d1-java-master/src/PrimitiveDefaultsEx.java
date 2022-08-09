
public class PrimitiveDefaultsEx {
//	initialized by default
	byte bvar;
	short shortvar;
	int intvar;
	long longvar;
	float floatvar;
	double doublevar;
	char charvar;
	boolean booleanvar;
	
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
	}
}
