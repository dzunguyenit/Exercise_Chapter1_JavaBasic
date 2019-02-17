package section3;

public class Ex04_EndWithString {

	public static void main(String[] args) {
		String demoString = "Ronaldo Versus Messi";
		String endWithString = "Messi";

		boolean result = demoString.endsWith(endWithString);
		if (result == true)
			System.out.println("Text contains " + endWithString + " is: " + result);
		else
			System.out.println("Text contains " + endWithString + " is: " + result);
	}

}
