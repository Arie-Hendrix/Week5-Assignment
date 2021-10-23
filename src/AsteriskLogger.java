
public class AsteriskLogger implements Logger{

	public void Log (String logMessage) {
		System.out.println("***" + logMessage + "***");		
	}
	
	public void Error (String errorMessage) {
		System.out.println("***" + "*".repeat(errorMessage.length()) + "***");
		System.out.println("***" + errorMessage + "***");
		System.out.println("***" + "*".repeat(errorMessage.length()) + "***");
	}
}
