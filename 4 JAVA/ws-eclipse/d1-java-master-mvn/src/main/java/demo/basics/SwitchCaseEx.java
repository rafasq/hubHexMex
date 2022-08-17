package demo.basics;

public class SwitchCaseEx {
	public static void main(String[] args) {
		//IP Months of the year (1-12)
		int day = 40;
		switch (day) {
		case 1: {
			System.err.println("Sun");
			break;
		}
		case 2: {
			System.err.println("Mon");
			break;
		}
		case 3: {
			System.err.println("Tue");
			break;
		}
		case 4: {
			System.err.println("Wed");
			break;
		}
		case 5: {
			System.err.println("Thu");
			break;
		}
		case 6: {
			System.err.println("Fri");
			break;
		}
		case 7: {
			System.err.println("Sat");
			break;
		}
		default : {
			System.err.println("Not a valid day");
		}
		}
	}
}
