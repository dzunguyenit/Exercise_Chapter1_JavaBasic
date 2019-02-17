package section1;

public class Ex02_TongUocSo {
	public static int sumUocSo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.print("\nSum cac uoc so = " + sumUocSo(10));
	}
}
