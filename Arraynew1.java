package nandhasan;

import java.util.Scanner;

public class Arraynew1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = s.nextInt();
		System.out.println("enter the elements of an array");
		int[] a = new int[size];
		int[] b = new int[a.length];
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("enter the value");
		int c = input.nextInt();
		int j=0 ;
		
			for (int i = 0; i < a.length; i++) {
				if (c == a[i]) {
					b[j] = 1;
					j++;
				}
			}
			for (int k = 0; k < a.length; k++)
			{
				if (a[k] != c) {
					b[j] = a[k];
					j++;
				}
			}

		
		for (int h = 0; h < b.length; h++) {
			System.out.println(b[h]);
		}
	}
}

