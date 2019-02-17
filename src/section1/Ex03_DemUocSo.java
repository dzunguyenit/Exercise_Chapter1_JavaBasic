package section1;

public class Ex03_DemUocSo {
	public static int demUocSo(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.print("\nCac uoc so = " + demUocSo(10));
	}
}
