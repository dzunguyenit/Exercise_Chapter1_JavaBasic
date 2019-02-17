package section2;

import java.util.Scanner;

public class Ex05_SoHoanHaoArray {
	public Boolean soHoanHao(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n)
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
		Ex05_SoHoanHaoArray array = new Ex05_SoHoanHaoArray();
		System.out.print("\nCac so hoan hao trong mang: ");
		for (int i = 0; i < arr.length; i++) {
			if (array.soHoanHao(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}