package practice;
import java.util.Scanner;
public class transposematrix {
public static void main(String[] args) {
	int i,j,res,n,temp;
	Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number of rows");
		int s=scan.nextInt();
		System.out.println("enter the number of column");
		int s1=scan.nextInt();
		if(s>s1)
			res=s;
		else
			res=s1;
		int mat1[][]=new int[res][res];
		System.out.println("enter the elements");
		for(i=0;i<s;i++)
		{
			for(j=0;j<s1;j++)
			{
			 mat1[i][j]=scan.nextInt();
			}
		}
		for(i=0;i<s;i++)
		{
			for(j=0;j<s1;j++)
			{
				System.out.print(mat1[i][j]+ " ");
			}
			System.out.println();
			
		}
		 for (  i= 0 ; i < res; i++ )
	         for ( j= i+1 ; j < res;j++ )
	             {
	                   temp=mat1[i][j]  ;
	                   mat1[i][j] =mat1[j][i]  ;
			mat1[j][i]  =temp;
	 
	            }
		for(i=0;i<s1;i++)
		{
			for(j=0;j<s;j++)
			
				System.out.print(mat1[i][j]+ " ");
			
			
		System.out.println();
			
		}
}
}
