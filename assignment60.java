package questionbank;
import java.util.Scanner;
public class assignment60 {
	

		public static void main(String[] args) {
			
			int i,sum=0,t=1;
			System.out.println("enter the number");
			Scanner S=new Scanner(System.in);
		    int n=S.nextInt();
			for (i = 1; i <= n; i++) 
		    {
		        System.out.print(t + " "); 
		        if(i<n)
		        {
		        	 System.out.print("+");
		        }
		        sum = sum +t;
		        t=(t*10)+1;
		        
		    }
			System.out.println();
			System.out.println("the sum of the series is:" +sum);	
	}
	}


