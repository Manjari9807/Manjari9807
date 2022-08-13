package Array;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7 };
		int b[] = { 0, 2, 6, 8, 9 };

		int k = 0;
		int[] a1 = new int[a.length + b.length];
		int m = a1.length / 2;
		int n = (a1.length - m);
		for (int i = 0; i < a.length; i++) {
			a1[k++] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			a1[k++] = b[j];
		}
		System.out.println(Arrays.toString(a1));
		Arrays.sort(a1);
		
		
		for (int i = 0; i < a1.length; i++) {
			
			System.out.print(a1[i]);
		}
		for (int i = 0; i < a1.length; i++) {
			
			if (i < m) {
				
				System.out.println( a1[i]);
			}
			else if(m<n)
			{
				
				System.out.print(a1[i]);
			}
		}

	}

}
