package Array;

import java.util.Arrays;

public class InvalidNumber {

	public static void main(String[] args) {
	int arr[] = {2, 2, 0, 4, 0, 8};
	int k=0;
	for(int i=0;i<arr.length;i++)
	{
		f1:for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])	
			{
			arr[i]=	(int) Math.pow(arr[i], 2);
		    arr[j]=0;
			break f1;
			}
		}
		
	}
	System.out.println(Arrays.toString(arr));
	int pos=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
			arr[pos++]=arr[i];
		}
		
	}
	while(pos<arr.length)
	{
		arr[pos++]=0;
	}
	
	System.out.println(Arrays.toString(arr));

}
}
