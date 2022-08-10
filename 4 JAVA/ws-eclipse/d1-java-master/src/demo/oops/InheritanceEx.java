package demo.oops;

public class InheritanceEx {
	public static void main(String[] args) {
		ADM admin = new ADM();
		admin.trgDetails();
		System.err.println(admin.emptype);
	}
}

class Training {
	int tid = 10;
	String tname = "Java";

	public void trgDetails() {
		System.out.println("Training id " + tid);
		System.out.println("Training name " + tname);
	}
}

class ADM extends Training {
	String emptype = "G3";
//	public void trgDetailgs() {
//		System.out.println("Training id " + tid);
//		System.out.println("Training name " + tname);
//	}
}