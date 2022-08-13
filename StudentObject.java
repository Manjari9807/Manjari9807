package consoledone;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Employees{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	private String name;
	private int userid;
	private String mailid;

	

}

public class StudentObject {

	public static void main(String[] args) {
		Employees e=new Employees();
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		e.setName(s.nextLine());
		System.out.println("enter your userid");
		e.setUserid(s.nextInt());
		s.nextLine();
		System.out.println("enter your emailId");
		e.setMailid(s.nextLine());
		Employees e1=new Employees();
		System.out.println("enter your name");
		e1.setName(s.nextLine());
		System.out.println("enter your userid");
		e1.setUserid(s.nextInt());
		s.nextLine();
		System.out.println("enter your emailId");
		e1.setMailid(s.nextLine());
		ArrayList<Employees> E=new ArrayList<Employees>();
		E.add(e);
		E.add(e1);
		Iterator i=E.iterator();
		while(i.hasNext())
		{
			Employees n=	(Employees) i.next();
			System.out.println(n.getName());
			System.out.println(n.getUserid());
			System.out.println(n.getMailid());
		}
		
	    
		
		
		
		

	}

}
