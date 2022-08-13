package Array;

import java.util.Arrays;

public class Unsorted 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
		int pos = 0;
		int k=arr.length-1;
		int arr1[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 0)
			{
				arr1[pos++] = arr[i];
			}
		}
		for (int i = arr.length-1; i >=0; i--)
		{
			if (arr[i] < 0)
			{
				arr1[k--] = arr[i];
			}	
		}
		System.out.println(Arrays.toString(arr1));
	}
}
