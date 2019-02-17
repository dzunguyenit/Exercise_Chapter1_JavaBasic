package section3;

public class Ex1_CountNumber {

	public static void main(String[] args) {
		String demoString = "Automation Testing Tutorials Online 01";
		char characterA = 'a';
		int count = 0;
		for (int i = 0; i < demoString.length(); i++) {
			if (demoString.charAt(i) == characterA) {
				count++;
			}
		}
		System.out.println("Quantity of the character " + characterA + " is: " + demoString + " = " + count);
	}

}
