package section1;

public class Ex01_LietKeUocSo {
	public static void main(String[] args) {
		int range = 10;
		for (int i = 1; i < range; i++) {
			if (range % i == 0)
				System.out.print(i + " ");
		}
	}
}
