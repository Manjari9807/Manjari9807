package practice;
import java.util.Scanner; 

public class Power {

	public static void main(String[] args) {
		double result;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("enter the power");
		Scanner w=new Scanner(System.in);
		int p=s.nextInt();
		result=Math.pow(n, p);
		System.out.println(result);
		
	}

}
