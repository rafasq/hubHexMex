package demo.basics;
enum Climate {
SPRING, SUMMER, FALL, WINTER
}
public class SwitchCaseEx {
	public static void main(String[] args) {
		intSwitch();
		enumSwitch(Climate.FALL);
	}
	private static void enumSwitch(Climate climate) {
	switch (climate.toString()) {
//		case "SPRING":
//			System.out.println("SPRING");
//			break;
		case "FALL":
			System.out.println("FALL");
//			break;
		case "WINTER":
			System.out.println("WINTER");
			break;
		default:
			System.out.println("NO SEASON.... GO AND LEARN JAVA!");
	}
	}
	private static void intSwitch() {
		//IP Months of the year (1-12)
		int day = 4;
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
