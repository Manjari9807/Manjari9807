package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		//Set<String>s1=new LinkedHashSet<String>();
		//Set<String>s1=new TreeSet<String>();
		Set<String>s1=new HashSet<String>();
		s1.add("manju");
		s1.add("manju");
		s1.add("chimi");
		s1.add("durga");
		System.out.println(s1);
	}
}
