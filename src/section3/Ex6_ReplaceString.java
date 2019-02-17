package section3;

public class Ex6_ReplaceString {

	public static void main(String[] args) {
		String demoString = "Automation Testing Tutorials Online 01";
		String newString = "Offline";
		String index = demoString.replace("Online", "Offline");
			System.out.println("New text after replacing string: " + newString + " is " + index);
	}
}
