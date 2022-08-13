package BalaSan;

import java.util.Arrays;

public class DescendingFactor {

	public static void main(String[] args) {
		int a[] = { 8, 2, 3, 12, 16 };
		int b[] = new int[a.length];
		int max = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					count++;
				}
			}
		//	System.out.println(count);
			b[i] = count;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (b[i] > b[j]) {
					int t = b[i];
					b[i] = b[j];
					b[j] = t;

					int t1 = a[i];
					a[i] = a[j];

					a[j] = t1;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");

		}
	}
}
