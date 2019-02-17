package section3;

public class Ex01_CountNumber {

	public static void main(String[] args) {
		String demoString = "Ronaldo Versus Messi";
		char characterA = 's';
		int count = 0;
		for (int i = 0; i < demoString.length(); i++) {
			if (demoString.charAt(i) == characterA) {
				count++;
			}
		}
		System.out.println("Quantity of the character " + characterA + " is: " + demoString + " = " + count);
	}

}
