package section1;

import java.util.Scanner;

public class Ex07_Sochinhphuong {
	public static Boolean Sochinhphuong(int n) {
		if (n < 4)
			return false;
		int canbac2 = (int) Math.sqrt(n);
		if (canbac2 * canbac2 == n)
			return true;
		return false;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		long n = sc.nextLong();
		for (int i = 1; i <= n; i++) {
			if (Sochinhphuong(i) == true)
				System.out.print(i + " ");
		}
	}
}