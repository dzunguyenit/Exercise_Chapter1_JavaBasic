package section2;

import java.util.Scanner;

public class Ex02_MaxInArray {
	public int maxNumber(int a[]) {
		int mmax = a[0];// Bien linh canh
		for (int i = 1; i < a.length; i++)
			if (a[i] > mmax)
				mmax = a[i];
		return mmax;
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
		Ex02_MaxInArray array = new Ex02_MaxInArray();
		System.out.print("\nMax = " + array.maxNumber(arr));
	}
}