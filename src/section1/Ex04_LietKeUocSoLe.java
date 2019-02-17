package section1;

public class Ex04_LietKeUocSoLe {

	public static void main(String[] args) {
		int odd = 10;
		for (int i = 1; i <= odd; i++) {
			if (odd % i == 0 && i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
