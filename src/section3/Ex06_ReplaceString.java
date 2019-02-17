package section3;

public class Ex06_ReplaceString {

	public static void main(String[] args) {
		String demoString = "Ronaldo Versus Messi";
		String oldString = "Messi";
		String newString = "Mbappe";
		String replaceString = demoString.replace(oldString, newString);
		System.out.println("New text after replacing string: " + oldString + "\n" + replaceString);
	}
}
