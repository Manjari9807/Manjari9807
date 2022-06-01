package questionbank;
import java.util.Scanner;
public class assignment3 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n=s.nextInt();
		int rem,rev=0;
		int sum=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		
		System.out.println(rev);
		
		int q=rev-sum;
		System.out.println(q);
	}

}
