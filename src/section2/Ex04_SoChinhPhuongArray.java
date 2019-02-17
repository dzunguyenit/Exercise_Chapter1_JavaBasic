package section2;

import java.util.Scanner;

public class Ex04_SoChinhPhuongArray {
	public Boolean soChinhPhuong(int n) {
		if (n < 4)
			return false;
		int canbac2 = (int) Math.sqrt(n);
		if (canbac2 * canbac2 == n)
			return true;
		return false;
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
		Ex04_SoChinhPhuongArray array = new Ex04_SoChinhPhuongArray();
		System.out.print("\nCac so chinh phuong trong mang: ");
		for (int i = 0; i < arr.length; i++) {
			if (array.soChinhPhuong(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}