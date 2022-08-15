
public class MainStringArgsEx {
	public static void main(String[] parametersToMain) {
//	for(String parameter : parametersToMain) {
//		System.err.println(parameter);
//	}
		String parameterArrary[] = { "Chennai", "Blue", "Shrek" };
		parameterArrayTest(parameterArrary);
	}

	public static void parameterArrayTest(String[] parameters) {
		for (String parameter : parameters) {
			System.err.println(parameter);
		}
	}
}
