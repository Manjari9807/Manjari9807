package practice;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner s=new Scanner(System.in);
		String n=s.nextLine();
	
		for(int j=n.length();j>0;j--)
		{
		 char rev=n.charAt(j-1);
		
System.out.print(rev);
	}
	}

}
