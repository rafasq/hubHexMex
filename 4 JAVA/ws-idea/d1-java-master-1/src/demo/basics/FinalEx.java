package demo.basics;

public class FinalEx {
public static void main(String[] args) {
	Test test = new Test();
//	The final field Test.boilingTemperature cannot be assigned
//	test.boilingTemperature = "200 degree celcius";
}
}

class Test {
//	final variable value cannot be changed
	final String boilingTemperature = "100 degree celcius";
}

// final class cannot be inherited
final class TFinal {

}
//class TDerived extends  TFinal {
//
//}

class Base {
	public  void bm(){

	}
//	cannot be overridden
	public final  void fbm(){

	}
}
class Derived extends  Base {
	@Override
	public  void bm(){

	}
//	'fbm()' cannot override 'fbm()' in 'demo.basics.Base'; overridden method is final
//	public   void fbm(){
//
//	}
}