package practice;

public class ArraySorting
{

	public static void main(String[] args)
	{
		int a[]= {1,5,7,8,9,6};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
			int temp=0;
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		    }	
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}

}
