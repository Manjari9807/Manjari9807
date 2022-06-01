package questionbank;
import java.util.Scanner;
public class assignment54 {

	public static void main(String[] args) {

	        Scanner input=new Scanner(System.in);        
	        System.out.println("Enter the number of inputs :");
	        int inputCount=input.nextInt();
	        int odd[]=new int[100];
	        int even[]=new int[100];
	        int oddit=0,evenit=0;
	        for(int i=0;i<inputCount;i++)
	        {
	            if(i%2!=0)
	            {
	                even[evenit]=input.nextInt();
	                evenit++;
	            }
	            else
	            {                
	                odd[oddit]=input.nextInt();
	                oddit++;
	            }
	        }
	        /*
	        for(int i=0;i<oddit;i++)
	            System.out.println(odd[i]);
	        */
	        
	        //Descending odd elements
	        for(int i=0;i<oddit-1;i++)
	        {
	            for(int j=i+1;j<oddit;j++)
	            {
	                if(odd[i]<odd[j])
	                {
	                    int temp=odd[i];
	                    odd[i]=odd[j];
	                    odd[j]=temp;
	                }
	            }
	        }
	        
	        //Ascending even elements
	        for(int i=0;i<evenit-1;i++)
	        {
	            for(int j=i+1;j<evenit;j++)
	            {
	                if(even[i]>even[j])
	                {
	                    int temp=even[i];
	                    even[i]=even[j];
	                    even[j]=temp;
	                }
	            }
	        }
	        int limit=oddit>evenit?oddit:evenit;
	        for(int i=0;i<limit;i++)
	        {
	            if(i<oddit)
	                System.out.print(" "+odd[i]);
	            if(i<evenit)
	                System.out.print(" "+even[i]);
	        }
	}
}