package questionbank;
import java.util.Scanner;

public class assignment58

{
	public static void main(String args[]) {
		int n=8;
		int m = n/2;
		int k=1;
		for(int i=1; i<=m; i++) {
			for(int j=1; j<=m*2; j++) {
				if(i==1) {
					System.out.print("*");
				}
				else if(i>1 && i<=m){
					
					    if(i+j >= m+2 && i+j<m+i+k) {
						    System.out.print("-");
					    }
						else{
						    System.out.print("*");
						    }
				}
				}
			k++;
			System.out.println();
			
		}
		k = 0;
		int c =0;
		for(int i=1; i<m; i++) {
			for(int j=1; j<=m*2; j++) {
				if(i==m-1) {
					System.out.print("*");
				}
				else if(i>=1 && i<m-1){
					    if(i+j >= m+k+c && i+j<=n-i+k) {
						    System.out.print("-");
					    }
						else{
						    System.out.print("*");
						    }
					    
				}
			}
			k++;
			c++;
			System.out.println();
			
		}
	}
}