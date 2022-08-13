package consoledone;
import  java.util.Scanner;
public class foodveg {
	
	
	 int vegbriyani = 100;
	    int vegnoodles = 120;
	    int pastry = 100;
	    int cornsoup=70;
	    int pizza = 200;
	    int coldCoffee = 100;
	    int coldrink = 80;
	    int icedtea = 80;
	    int ch;
	    int quantity;
	     int total;
	    String again;
	    
	 public void generateBill()
	    {
	        System.out.println();
	        System.out.println("***************** Thankyou for ordering ******************");
	        System.out.println("****************Your Bill is : " +total+"*****************");
	    }
	 Scanner sc=new Scanner(System.in);

	    public void order() {
	        while (true) {
	            System.out.print("Enter Your Choice ");
	            ch = sc.nextInt();
	            switch (ch) {
	                case 1:
	                    System.out.println("You have Selected veg briyani");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = total + quantity * vegbriyani;

	                    break;

	                case 2:
	                    System.out.println("You have Selected  veg noodles");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = total + quantity * vegnoodles;

	                    break;
	               case 3:
	                    System.out.println("You have Selected  cornsoup");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = total + quantity * cornsoup;

	                    break;

	                case 4:
	                    System.out.println("You have Selected Pastry");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = total + quantity * pastry;

	                    break;
	                case 5:
	                    System.out.println("You have Selected Cold Drinks");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = total + quantity * coldrink;

	                    break;
	                case 6:
	                    System.out.println("You have Selected Cold Coffee");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = total + quantity * coldCoffee;

	                    break;

	                case 7:
	                    System.out.println("You have Selected Pizza");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity : ");
	                    quantity = sc.nextInt();
	                    total = total + quantity * pizza;

	                    break;

	                case 8:
	                    System.out.println("You have Selected Iced Tea");
	                    System.out.println();
	                    System.out.println("Enter the desiered Quantity");
	                    quantity = sc.nextInt();
	                    total = total + quantity * icedtea;

	                    break;

	                case 9:
	                    System.exit(1);
	                    break;

	                default:
	                    break;
	            }
	            System.out.println();
	            System.out.print("Do you wish to order anything else (Y/N) : ");
	            again = sc.next();
	            if(again.equalsIgnoreCase("Y"))
	            {
	            	order();
	            }
	            else if(again.equalsIgnoreCase("N"))
	            {
	            	 generateBill();
	            	 if(again.equalsIgnoreCase("N"))
	 	            {
	 	            	System.out.println("please enter your payment method");
	 	            	System.out.println("press 1 to pay credit card or 2 to COD");
	 	            	int cash_or_cod=0;
	 	            	cash_or_cod=sc.nextInt();
	 	            //	int card_password;
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
	            }
	            
	            else{
	            	System.out.println("Invalid Choice");
	            	}
	           
	        }    }} 

