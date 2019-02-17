package section3;

public class Ex2_ContainsString {

	public static void main(String[] args) {
		String demoString = "Automation Testing Tutorials Online 01";
		String containsString = "Testing";

		boolean result = demoString.contains(containsString);
		if (result == true)
			System.out.println("Text contains " + containsString + " is: " + result);
		else
			System.out.println("Text contains " + containsString + " is: " + result);
	}

}
