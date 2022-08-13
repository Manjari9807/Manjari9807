package BalaSan;

import java.util.Scanner;
public class NumberIntoWord {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		if (n < 0 || n > 999) {
			System.out.println("wrong input");
		} else {
			int u = n % 10;
			int tt = n / 10;
			int t = tt % 10;
			int h = n / 100;
			String uw[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
					"eleven", "tewlve", "thirteen", "fouteen", "fifteen", "sixteen", "seventeen", "eighteen",
	"nineteen" };
			String tw[] = { " ", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
			String hw = "hundred";
			if (n < 20) {
				System.out.println(uw[n]);
			} else if (n < 100) {
				System.out.println(tw[t] + uw[u]);
			} else
				System.out.println(uw[t] + hw + tw[t] + uw[u]);
		}
	}
}
