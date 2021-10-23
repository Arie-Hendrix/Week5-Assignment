
public class EndLog {

	public static void main(String[] args) {
		
		Logger space = new SpacedLogger();
		space.Log("Greetings");
		System.out.println();
		space.Error("Salutations");
		System.out.println();
		
		System.out.println();
		Logger asterisk = new AsteriskLogger();
		asterisk.Log("Trial");
		System.out.println();
		asterisk.Error("Testing");

	}

}
