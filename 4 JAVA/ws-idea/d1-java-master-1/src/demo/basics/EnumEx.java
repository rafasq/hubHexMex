package demo.basics;

public class EnumEx {
	public static void main(String[] args) {
		ACSetting setting = ACSetting.COOL;
		String settingAppied = setting.toString();
		System.err.println(settingAppied);
		ACSetting setting1 = ACSetting.valueOf("TURBO");
		System.err.println(setting1);
		System.err.println(ACSetting.DRY);
	}
}

enum ACSetting {
	FAN, DRY, COOL, AUTO, TURBO
}
