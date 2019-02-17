package section3;

public class Ex02_ContainsString {

	public static void main(String[] args) {
		String demoString = "Ronaldo Versus Messi";
		String containsString = "Messi";

		boolean result = demoString.contains(containsString);
		if (result == true)
			System.out.println("Text contains " + containsString + " is: " + result);
		else
			System.out.println("Text contains " + containsString + " is: " + result);
	}

}
