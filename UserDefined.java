package consoledone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
 class Login {
	 private String name;
	    private String email;
	    private String password;
	    Login(String name, String email, String password){
	        this.name = name;
	        this.email = email;
	        this.password = password;
	    }
	    public String getName() {
	        return name;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public String getPassword() {
	        return password;
	    }
	}
public class UserDefined {
    public static void main(String[] args) {
        Login l = new Login("chimithra","email@gmail.com","password");
        Login l1 = new Login("charu","email1@gmail.com","password1");
        Login l2 = new Login("manju","manju@gmail.com","password2");
        ArrayList<Login> a = new ArrayList<Login>();
        a.add(l);
        a.add(l1);
        a.add(l2);
        Scanner in = new Scanner(System.in);
        Iterator i = a.iterator();
        while(i.hasNext())
        {
            Login j=  (Login) i.next();
            System.out.println(j.getName());
            System.out.println(j.getEmail());
            System.out.println(j.getPassword());
        }
        boolean flag = true;
        System.out.println("Enter the Username : ");
        String username = in.nextLine();
        System.out.println("Enter the Password: ");
        String password = in.nextLine();
        Iterator j = a.iterator();
        while(j.hasNext())
        {
            Login k = (Login)j.next();
            if(k.getName().equals(username) && k.getPassword().equals(password)){
                System.out.println("Valid user !!!");
                flag = false;
            }
        }
        if(flag){
            System.out.println("Not valid user !!! ");
        }
}
}
