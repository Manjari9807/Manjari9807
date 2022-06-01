package questionbank;

import java.util.Scanner;

public class assignment5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the character");
		char q = s.next().charAt(0);
		int n = q-64;

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= n; j++) {
				if (i >= j)
					System.out.print(q);
			}
			q--;
			System.out.println();
		}

	}

}
