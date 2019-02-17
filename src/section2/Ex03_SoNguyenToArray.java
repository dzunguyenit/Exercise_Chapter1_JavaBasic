package section2;

import java.util.Scanner;

public class Ex03_SoNguyenToArray {
	public Boolean songuyento(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");

		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.print("Nhap cac phan tu cua mang: \n");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = scanner.nextInt();
		}
		System.out.print("Cac phan tu cua mang: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		Ex03_SoNguyenToArray array = new Ex03_SoNguyenToArray();
		System.out.print("\nCac so nguyen to trong mang: ");
		for (int i = 0; i < arr.length; i++) {
			if (array.songuyento(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}