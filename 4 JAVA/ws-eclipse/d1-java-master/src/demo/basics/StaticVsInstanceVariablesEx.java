package demo.basics;

public class StaticVsInstanceVariablesEx {
	public static void main(String[] args) {
		// directly accessed with class name
		String companyName = Employee.companyName;
		System.err.println(companyName);
		// new keyword creates instance
		Employee employee1 = new Employee();
		employee1.employeeName = "Sam";
		employee1.clientName = "Paypal";
		Employee employee2 = new Employee();
		employee2.employeeName = "Peter";
		String employeeName1 = employee1.employeeName;
		employee2.clientName = "Amazon";
		String client1 = employee1.clientName;
		String client2 = employee2.clientName;
		String employeeName2 = employee2.employeeName;
		System.err.println(employeeName1 + " works for " + client1);		
		System.err.println(employeeName2 + " works for " + client2);	}
}

class Employee {
//	static / belongs to class
	public static String companyName = "The Amazing Company";
//	intance variable / belongs to instance
	public String employeeName;
	public String clientName;
}