package demo.oops;
/**
 * BonusCalculator calculates the bonus of employees
 */
public class BonusCalculator {
	static int salary = 50;

/**
 * Returns the total salary with bonus by accepting the bonus
 * @param bonus Is the bonus of employee
 * @return The total of salary and bonus
 */
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
