package exercises;

import java.util.Scanner;

public class Prime {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input for prime number");
		int input = sc.nextInt();
		int count;
		System.out.println("list of prime number upto " + input + "is:");
		for (int i = 2; i <= input; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					count = count + 1;

			}
			if (count == 0)
				System.out.println(i);

		}
	}

}
