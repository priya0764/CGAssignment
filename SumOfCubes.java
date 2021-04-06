package exercises;

public class SumOfCubes {
	static int cubeSum() {
		int num = 22;
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (digit * digit * digit);
			num = num / 10;

		}
		System.out.println(sum);
		return num;

	}

	public static void main(String args[]) {
		cubeSum();
		// System.out.println(sum);

	}

}