package consoledone;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AtmSimpleConsole extends Thread {
	static Scanner s = new Scanner(System.in);
	public static int bal = 10000;

	boolean flag=true;

	private void call() throws InterruptedException {
		Thread n = new Thread();
		System.out.println("welcome to our ATM");
		n.run();
		{
			System.out.println("please insert your card");

			Thread.sleep(3000);
			System.out.println("processing done");
		}
		n.start();
		System.out.println("please enter your pin");
		int num = s.nextInt();
		if (num == 8509) {
			System.out.println("please proceed");
			process();
		} else {
			flag=false;
			System.out.println("you entered wrong pin");
            
		}
	}
	void process() throws InterruptedException {
	while(flag)
	{
			Map<Integer, String> m = new LinkedHashMap<Integer, String>();
			m.put(1, "withdrawal");
			m.put(2, "deposit");
			m.put(3, "balance status");
			m.put(4, "exit");
			Set<Map.Entry<Integer, String>> s1 = m.entrySet();
			System.out.println("choose the one to proceed");
			for (Map.Entry<Integer, String> it : s1) {
				System.out.println("option" +" "+ it.getKey() + " " + it.getValue());
			}
			int option = s.nextInt();
			if (option == 1) {
				withdrawal();
			} else if (option == 2) {
				deposit();
			} else if (option == 3) {
				System.out.println("balance" + bal);
			}
			else
			{
				System.out.println("thanks for visiting us!");
				System.exit(4);
			}
			System.out.print("Do you wish to do anything else (Y/N) : ");
			String again = s.next();
			if (again.equalsIgnoreCase("Y"))
			{
              process();
			} 	
			}
	}
	

	private static void deposit() {

		System.out.println("enter the money to be deposited");
		int deposit1 = s.nextInt();
		bal = bal + deposit1;
		System.out.println("your money is suceesfully depoisted!");

	}

	private static void withdrawal() throws InterruptedException {

		System.out.println("enter the money to be withdrawan");
		int withdraw = s.nextInt();
		if (withdraw < bal) {

			bal -= withdraw;
			Thread n = new Thread();
			n.run();
			{
				System.out.println("processing.....");
				Thread.sleep(3000);
				System.out.println("processing done");
				System.out.println("please collect your money");
				System.out.println("Thanks for visisting us");
			}
			n.start();

		} else {
			System.out.println("insufficiend fund");
		}

	}
	
	public static void main(String[] args){
		AtmSimpleConsole atm = new AtmSimpleConsole();
		try {
			atm.call();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
