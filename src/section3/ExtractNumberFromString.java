package section3;

public class ExtractNumberFromString {
	public static void main(String[] args) {
		String text = "Showing 1 to 25 of 50 entries";
		String[] subString = text.split(" ");
		for (int i = 0; i < subString.length; i++) {
			System.out.println("Vi tri thu " + i + ": " + subString[i]);
		}
		System.out.println("Number of text position 2 is: " + extractNumberFromString(text, 1));
		System.out.println("Number of text position 3 is: " + extractNumberFromString(text, 3));
		System.out.println("Number of text position 5 is: " + extractNumberFromString(text, 5));

		System.out.println("First text = : " + subString[0]);
		System.out.println("Last text = : " + subString[subString.length - 1]);
		
	}

	public static int extractNumberFromString(String text, int number) {
		String[] subString = text.split(" ");
		int result = Integer.parseInt(subString[number]);
		return result;
	}
}