package demo.oops;

public class OverridingEx {
	public static void main(String[] args) {
		Competency com = new Competency();
		com.trainingDetails();
	}
}

class FTP {
	public void trainingDetails() {
		String trg = "Java,SQL,Angular";
		System.out.println("FTP training tec " + trg);
	}
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