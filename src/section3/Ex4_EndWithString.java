package section3;

public class Ex4_EndWithString {

	public static void main(String[] args) {
		String demoString = "Automation Testing Tutorials Online 01";
		String endWithString = "Online";

		boolean result = demoString.endsWith(endWithString);
		if (result == true)
			System.out.println("Text contains " + endWithString + " is: " + result);
		else
			System.out.println("Text contains " + endWithString + " is: " + result);
	}

}
