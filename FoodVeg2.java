package consoledone;
import java.util.Scanner;
public class FoodVeg2 {
	int cickenbriyani = 200;
	int chickennoodles = 180;
	int muttonsoup = 90;
	int muttonbriyani = 300;
	int egglappa = 150;
	int chickenpizza = 200;
	int ch;
	int quantity;
	int exit;
	int total=0;
	String again;
	Scanner sc = new Scanner(System.in);
	public void generateBill() {
		System.out.println();
		System.out.println("***************** Thankyou for ordering ******************");
		System.out.println("****************Your Bill is : " + total + "*****************");
	}
	public void order() {
		while (true) {
			System.out.print("Enter Your Choice ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("You have Selected cickenbriyani");
				System.out.println();
				System.out.println("Enter the desiered Quantity : ");
				quantity=sc.nextInt();
				total = total + quantity * cickenbriyani;
				break;
			case 2:
				System.out.println("You have Selected  chickennoodles");
				System.out.println();
				System.out.println("Enter the desiered Quantity : ");
				quantity = sc.nextInt();
				total = total + quantity * chickennoodles;

				break;
			case 3:
				System.out.println("You have Selected  muttonsoup");
				System.out.println();
				System.out.println("Enter the desiered Quantity : ");
				quantity = sc.nextInt();
				total = total + quantity * muttonsoup;

				break;

			case 4:
				System.out.println("You have Selected muttonbriyani");
				System.out.println();
				System.out.println("Enter the desiered Quantity : ");
				quantity = sc.nextInt();
				total = total + quantity * muttonbriyani;

				break;
			case 5:
				System.out.println("You have Selected egglappa");
				System.out.println();
				System.out.println("Enter the desiered Quantity : ");
				quantity = sc.nextInt();
				total = total + quantity * egglappa;

				break;
			case 6:
				System.out.println("You have Selected chickenpizza");
				System.out.println();
				System.out.println("Enter the desiered Quantity : ");
				quantity = sc.nextInt();
				total = total + quantity * chickenpizza;

				break;
			case 7:
				System.exit(1);
				break;

			default:
				break;
			}
			System.out.println();
			System.out.print("Do you wish to order anything else (Y/N) : ");
			again = sc.next();
			if (again.equalsIgnoreCase("Y")) {
				order();
			} else if (again.equalsIgnoreCase("N")) {
				generateBill();
				 if(again.equalsIgnoreCase("N"))
	 	            {
	 	            	System.out.println("please enter your payment method");
	 	            	System.out.println("press 1 to pay credit card or 2 to COD");
	 	            	int cash_or_cod=0;
	 	            	cash_or_cod=sc.nextInt();
	 	           
	 	            	if(cash_or_cod==1)
	 	            	{
	 	            		System.out.println("please enter your credit card number");
	 	            		long credit_card=sc.nextLong();
	 	            		System.out.println("please enter your credit card name");
	 	            		String card_number=sc.nextLine();
	 	            		sc.next();
	 	            		System.out.println("please enter your credit card cvv");
	 	            		int card_cvv=sc.nextInt();
	 	            		System.out.println("please enter the total amount to be paid");
	 	            		int amount_paid=sc.nextInt();
	 	            		System.out.println("Amount paid:" + total );
	 	            		System.out.println("process completed");
	 	            		System.out.println("Thanks for choosing us");
	 	            		System.out.println("Your order is on the way:)");
	 	            	}
	 	            	else if(cash_or_cod==2)
	 	            	{
	 	            		System.out.println("you choose COD");
	 	            		System.out.println("we recieve your order");
	 	            		System.out.println("Thanks for choosing us");
	 	            		System.out.println("Your order is on the way:)");
	 	            	}
	 	            	
	 	            }
	            
				System.exit(1);
			} else {
				System.out.println("Invalid Choice");
			}
		}
	}
}
