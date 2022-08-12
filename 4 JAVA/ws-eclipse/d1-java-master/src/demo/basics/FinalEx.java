package demo.basics;

public class FinalEx {
public static void main(String[] args) {
	Test test = new Test();
//	The final field Test.boilingTemperature cannot be assigned
//	test.boilingTemperature = "200 degree celcius";
}
}

class Test {
	final String boilingTemperature = "100 degree celcius";
}