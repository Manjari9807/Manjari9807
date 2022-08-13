import java.util.Scanner;


public class ProgramPattern {

	static void printPattern(String str,int len) {
        for(int i=0;i<=len;i++)
        {
        	for(int j=0;j<len;j++) 
        	{
        	if(j==i|| i+j==len-1)
        	System.out.print(str.charAt(j));
        	else
        		System.out.print(" ");
        	}
        	System.out.println(" ");
        }
        
	}
	public static void main(String[] args)
	{
	    String str = "program";
	    int len = str.length();
	    printPattern(str, len);
	}

}
