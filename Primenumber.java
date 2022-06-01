package practice;

public class Primenumber {

	public static void main(String[] args) {
		int num = 13;
		 boolean flag = true;
		 for(int i = 2; i < num; ++i)
		 {
		
		 if(num % i == 0)
		{
		flag = false;
		break;
		}
		 }
		 if (flag==true)
		 System.out.println(num + " is a prime number. ");
		 else
		 System.out.println(num + " is not a prime number. ");
		 

	}

}
