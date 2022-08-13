package BalaSan;

import java.util.Scanner;

public class LookAndSay {
	private static String lookAndSay(String num) {
		StringBuilder str=new StringBuilder();
		char rep=num.charAt(0);
		 num=num.substring(1)+" ";
		 int count=1;
		 for(char act:num.toCharArray())
		 {
			 if( act!=rep)
			 {
				str.append(count+ ""+rep) ;
				count=1;
				rep=act;
			 }
			 else
			 {
				 count++;
			 }
		 }
		return str.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		String num="1";
		for(int i=1;i<=n;i++)
		{
			System.out.println(num);
			num=lookAndSay(num);
		}
	}


	

}
