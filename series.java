package questionbank; 
import java.util.Scanner;
public class series{
	public static void main(String[] args)
	{
		int i,j;
		Scanner a=new Scanner(System.in);
		int n=a.nextInt();
		for(i=n-1;i>=1;i--)
		{
			if(i>1 && i<5)
			{
			for(j=1;j<=2;j++)
			{
			System.out.print(i);
			}
		}
			else
			{
				for(j=1;j<=3;j++)
				{
					System.out.print(i);
				}
			}
		}
	}
	
}
	
	
	
