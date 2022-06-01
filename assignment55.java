package questionbank;
import java.util.Scanner;
public class assignment55 {

	public static void main(String[] args)
	{
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 for(int i=0;i<n;i++)
	 {
		System.out.print("*" + " ");
	 
		 for (int j=0;j<n-1;j++)
		 {
			 
			 
			 if(i==0 || i==n-1)
			 
				 System.out.print("*" + " ");
			 
			 else 
			 
				 System.out.print(" ");
		 }
		 System.out.println();
		 }
	
	 }
	
	}


