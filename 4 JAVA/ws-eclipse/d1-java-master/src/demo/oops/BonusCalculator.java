package demo.oops;

public class BonusCalculator {
	static int salary = 50;
// param bonus / returns total
	float calculateTotalSalary(float bonus) {
		float total;
		return salary + bonus;
	}

	public static void main(String[] args) {
//		create object
		BonusCalculator bonusCalculatorObject = new BonusCalculator();
		// calling function on object
		float bonus = bonusCalculatorObject.calculateTotalSalary(5);
		System.err.println(bonus);
	}
}
