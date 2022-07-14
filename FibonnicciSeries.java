package MaheshSan;

import java.util.Scanner;

//Write a program to find the first 10 fibonacci numbers that are also prime
public class FibonnicciSeries 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int f = 0, f1 = 1;
		int f2 = 0;
		int i=0;
		for(i=1;i<=n;i++)
		{	
			int flag=0;
		    f2 = f + f1;
		    
		  for(int j=1;j<=f2;j++)
		  {
		     if (f2 % j == 0) 
		     {
		       flag++; 
		     }
		  }
		        if(flag == 2)
		        {
			    System.out.println(f2);
		        }	
		 f = f1;
		 f1 = f2;
		}  
	   
	}

}
