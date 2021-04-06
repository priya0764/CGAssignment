package exercises;

public class Difference {
	public static int calculateDifference(int n) {
		int diff = 0;
		int squareSum = 0;
		int sumSqu = 0;
		for (int i = 1; i <= n; i++) {
			squareSum = squareSum + i * i;
			sumSqu = sumSqu + i;

		}
		sumSqu = sumSqu * sumSqu;
		diff = Math.abs(squareSum - sumSqu);
		return diff;
	}

	public static void main(String args[]) {
		System.out.println(calculateDifference(5));
	}
}
