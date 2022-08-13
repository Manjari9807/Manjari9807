package BalaSan;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the starting value");
		int i=s.nextInt();
		System.out.println("enter the nth value");
		int n=s.nextInt();
		for( i=i+1;i<n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		

	}

}
