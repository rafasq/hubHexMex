package demo.oops;

public class OverridingEx {
	public static void main(String[] args) {
		STP stp = new FTP();
		stp.trainingDetails();
//		Competency com = new Competency();
//		com.trainingDetails();
	}
}

class STP {
	public void trainingDetails() {
		String trg = "Email writing, Cultural Sensitivity";
		System.out.println("STP training soft skils " + trg);
	}
}
class FTP extends STP{
//	@Override
//	public void trainingDetails() {
////		super.trainingDetails();
//		String trg = "Java,SQL,Angular";
//		System.out.println("FTP training tec " + trg);
//	}
}

class Competency extends FTP {
//	base method
//	public void trainingDetails() {
//		String trg = "Java,SQL,Angular";
//		System.out.println("FTP training tec " + trg);
//	}

	String comTrg = "Block chain, Big Data ";

//	derived method / overriding
	@Override
	public void trainingDetails() {
		super.trainingDetails();
		System.out.println("Competency training tec " +  comTrg);
	}
}