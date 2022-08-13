import java.util.ArrayList;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		ArrayList<Object>a=new ArrayList<Object>();
		System.out.println("Initial size:" +a.size());
		a.add(1);
		a.add("String");
		a.add('c');
		System.out.println("Initial size:" +a.size());
		System.out.println("contents of:" + a);
		a.remove(1);
		System.out.println("Initial size:" +a.size());
		Object s[]=new Object[a.size()];
		s=a.toArray(s);
		System.out.println(s);
	}

}
