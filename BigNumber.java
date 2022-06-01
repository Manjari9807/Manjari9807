package practice;

public class BigNumber {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
			
				max = arr[i];
			    //arr[i]=max;
			
		}
			System.out.print(max);
		
	}

	}
