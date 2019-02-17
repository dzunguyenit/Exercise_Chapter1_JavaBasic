package section3;

public class Ex03_StartWithString {

	public static void main(String[] args) {
		String demoString = "Ronaldo Versus Messi";
		String startWithString = "Ronaldo";

		boolean result = demoString.startsWith(startWithString);
		if (result == true)
			System.out.println("Text contains " + startWithString + " is: " + result);
		else
			System.out.println("Text contains " + startWithString + " is: " + result);
	}

}
