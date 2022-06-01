package questionbank;
import java.util.Scanner;
public class assignment57 
{
public static void main(String[] args)
{
	System.out.println("enter the number");
	Scanner n=new Scanner(System.in);
	int s=n.nextInt();
	
	for (int i = 1; i <= s; i++ ) 
	{
		for (int j = 1; j <= s; j++ ) 
		{
			
			if(i == j || i+j==s+1 )
			{
			
				System.out.print(j + " ");
			}
			else
			{
				System.out.print(" ");
			}			
		}
		System.out.println();
	}
}

}

     

