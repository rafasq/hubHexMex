
public class MessageUtil {
	private String message;

	public MessageUtil(String message) {
//		assigning the parameter value to instance variable value
		this.message = message;
	}

	public String printMessage() {
		System.out.println(message);
		return message;
	}
}
