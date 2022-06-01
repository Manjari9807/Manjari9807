package practice;
import java.util.Scanner;
public class InsertArray {

	public static void main(String[] args) {
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements:");
		for(i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("enter the number to insert");
		 int s=scan.nextInt();
		 arr[n]=s;
		 System.out.print("enter the second number to insert");
		 int s1=scan.nextInt();
		arr[n+1]=s1;
		 System.out.println("after inserting");
		 for(i=0;i<n;i++)
		 {
			System.out.println(arr[i]+ " ");
		 }
		 System.out.println(arr[n]);
		 System.out.println(arr[n+1]);
		 
	}
	

}
