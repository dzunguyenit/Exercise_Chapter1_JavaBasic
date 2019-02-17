package section3;

public class Ex3_StartWithString {

	public static void main(String[] args) {
		String demoString = "Automation Testing Tutorials Online 01";
		String startWithString = "Automation";

		boolean result = demoString.startsWith(startWithString);
		if (result == true)
			System.out.println("Text contains " + startWithString + " is: " + result);
		else
			System.out.println("Text contains " + startWithString + " is: " + result);
	}

}
