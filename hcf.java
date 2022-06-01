package practice;
import java.util.Scanner;

public class hcf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first number");
        int n1=s.nextInt();
        System.out.println("enter the second number");
        int n2=s.nextInt();
        int temp;
        if(n2>0)
        {
        	temp=n2;
        	n2=n1%n2;
        	n1=temp;
        }
        System.out.println(n2);
	}

}
