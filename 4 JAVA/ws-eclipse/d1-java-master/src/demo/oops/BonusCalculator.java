package demo.oops;

public class BonusCalculator {
	static int salary = 50;

// param bonus / returns total
	float calculateTotalSalary(float bonus) {
		float total;
		total  = salary + bonus;
		return total;
	}

	public static void main(String[] args) {
//		create object
		BonusCalculator bonusCalculatorObject = new BonusCalculator();
		// calling function on object
		float total = bonusCalculatorObject.calculateTotalSalary(5);
		System.err.println(total);
	}
}
