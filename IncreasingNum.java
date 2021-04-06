package exercises;

public class IncreasingNum {
	public static boolean increasingNumber(int n) {
		String s = Integer.toString(n);
		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] > ch[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		System.out.println(increasingNumber(1234));
	}

}
