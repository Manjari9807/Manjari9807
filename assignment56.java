package questionbank;

import java.util.Scanner;

public class assignment56 {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner n = new Scanner(System.in);
		int s = n.nextInt();
		int temp = 1;
		    for (int i = 0; i <s; i++) {
			
            for(int l=s;l>=i;l--)
            {
            	System.out.print(" ");
            }
            	for (int j = 0; j <=i; j++)
    			{
				System.out.print(temp+ " ");
                temp++;
			}
			
		    
			System.out.println();
		}
	}
	}

