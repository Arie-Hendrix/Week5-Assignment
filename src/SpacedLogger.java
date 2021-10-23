
public class SpacedLogger implements Logger{

	
	private String result(String input) {
		StringBuilder product = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (i < input.length() - 1) {
				product.append(input.charAt(i));
				product.append(' ');
			}else {
				product.append(input.charAt(i));
			}
		}
			return product.toString();
		}
	
	
	public void Log (String messageForLog) {
		System.out.println(result(messageForLog));
		}
	
	public void Error (String errorMessage) {
		System.out.println("Error: " + result(errorMessage));
	}
}
