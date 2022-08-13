package consoledone;

import java.util.Scanner;

public class FoodOrder {

	public void restaurants() {

		Scanner s = new Scanner(System.in);
		System.out.println("**************** Welcome To our Zoho Cafe ****************");
		System.out.println("choose 1:menu for veg");
		System.out.println("choose 2:menu for nonveg");
		int choose = s.nextInt();

		if (choose == 1) {
			System.out.println("you choose veg");
			System.out.println("Here is the veg menu detail");
			displayMenu(" ");
		} else if (choose == 2) {
			System.out.println("you choose nonveg");
			System.out.println("Here is the nonveg menu detail");
			Menu();
		}
	}
	Scanner sc = new Scanner(System.in);

	public void displayMenu(String veg) {

		System.out.println("=====================================================");
		System.out.println("           1.veg briyani           100/-");
		System.out.println("           2.veg noodles           120/-");
		System.out.println("           3.corn soup             70 /-");
		System.out.println("           4.Pastry                100/-");
		System.out.println("           5.Cold Drinks           80/- ");
		System.out.println("           6.Cold Coffee           100/-");
		System.out.println("           7.Pizza                 200/-");
		System.out.println("           8.Iced Tea              80/- ");
		System.out.println("           9.Exit                       ");
		System.out.println("======================================================");
		System.out.println("\n");
		System.out.println("          What Do you Want to Order Today??");

		foodveg s1 = new foodveg();
		s1.order();

	}

	public void Menu() {
		System.out.println("**************** Welcome To our zoho Cafe ****************");
		System.out.println("=====================================================");
		System.out.println("           1.chicken briyani           200/-");
		System.out.println("           2.chicken noodles           180/-");
		System.out.println("           3.mutton soup               90 /-");
		System.out.println("           4.muttonbriyani             300/-");
		System.out.println("           5.egglappa                  150/-");
		System.out.println("           6.chickenpizza              200/-");
		System.out.println("           7.Exit                           ");
		System.out.println("======================================================");
		System.out.println("          What Do you Want to Order Today??");

		FoodVeg2 s2 = new FoodVeg2();
		s2.order();

	}

	public static void main(String[] args) {

		FoodOrder f1 = new FoodOrder();
		f1.restaurants();

	}

}
