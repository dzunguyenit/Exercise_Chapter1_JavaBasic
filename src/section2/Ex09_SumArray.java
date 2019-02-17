package section2;

public class Ex09_SumArray {
	public static void main(String[] args) {
		int array[] = { 69, -41, 48, 22, -34, 100, -14, 70, 66, -29 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0)
				sum += array[i];
		}
		System.out.println("Tong la: " + sum);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}