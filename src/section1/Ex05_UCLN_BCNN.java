package section1;

import java.util.Scanner;

public class Ex05_UCLN_BCNN {

	public static int UCLN(int a, int b) {
		int temp = a;
		while (a % temp != 0 || b % temp != 0)
			temp--;
		return temp;
	}

	public static int BCNN(int a, int b) {
		int temp = a;
		while (temp % a != 0 || temp % b != 0)
			temp++;
		return temp;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.println("UCLN = " + UCLN(a, b));
		System.out.println("BCNN = " + BCNN(a, b));
	}
}
