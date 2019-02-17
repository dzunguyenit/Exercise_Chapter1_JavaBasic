package section2;

import java.util.Scanner;

public class Ex01_SumArray {
	public void sum(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0 && a[i] % 2 == 0)
				sum += a[i];
		}

		System.out.println("\nTong la: " + sum);
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
		Ex01_SumArray sumArray = new Ex01_SumArray();
		sumArray.sum(arr);

	}
}
