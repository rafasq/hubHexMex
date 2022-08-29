package demo.oops;

public class FinalEx2 {
	public static void main(String[] args) {
		ADM admin = new ADM();
		admin.trgDetails();
		System.err.println(admin.emptype);
	}
}

final class Training1 {
//	final variables has to be initialized
//	final variables values cannot be changed
	final String place = "Mexico";
	int tid = 10;
	String tname = "Java";

	public void trgDetails() {
		System.out.println("Training id " + tid);
		System.out.println("Training name " + tname);
	}
}

//The type ADM2 cannot subclass the final class Training1
//class ADM2 extends Training1 {
//
//}

class Training2 {
	int tid = 10;
	String tname = "Java";

	public final void venueDetails() {
		System.out.println("Training id " + tid);
		System.err.println("Venue ");
	}

	public void trgDetails() {
		System.out.println("Training id " + tid);
		System.out.println("Training name " + tname);
	}
}

class ADM3 extends Training2 {
	@Override
	public void trgDetails() {
		System.out.println("Training id " + tid);
		System.out.println("Training name " + tname);
	}
//	Cannot override the final method from Training2
//	public  void venueDetails() {
//		System.err.println("Final method cannot be overridden!");
//	}
}