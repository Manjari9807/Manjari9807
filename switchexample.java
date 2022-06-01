package FirstProg;
import java.util.Scanner;

public class switchexample {
	
		   public static void main(String[] args) {
		     
		      char grade;
		      System.out.print("Enter a number: ");  
		      Scanner sc = new Scanner(System.in); 
		      int score = sc.nextInt(); 
		      switch(score/10) 
		      {
		      
		        case 10:
		        case 9:
		           grade = 'A';
		           break;
		        
		        case 8:
		           grade = 'B';
		           break;
		       
		        case 7:
		           grade = 'C';
		           break;
		        
		        case 6:
		           grade = 'D';
		           break;
		        
		        case 5:
		           grade = 'E';
		           break;
		       
		        default:
		           grade = 'F';
		           break;
		      }
		      System.out.println("Your Grade is  = " + grade);
		   }

		}

