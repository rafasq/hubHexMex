package demo.basics;
/**
 * This class is used to represent the correct / wrong use of main
 */
public class WrongMain {
	
	/**
	 * @param args the array containing the input strings
	 */
//	public static void main(String[] args) {
//		System.err.println("oh yes....");
//	}
//	public static void main(String[] anything) {
//		System.err.println("oh yes....");
//	}
//	static public void main(String[] anything) {
//		System.err.println("oh yes....");
//	}
	static public int main(String[] anything) {
		System.err.println("oh no....");
		return 0;
	}
}
