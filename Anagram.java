package MaheshSan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Anagram {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";
		s1 = s1.toLowerCase();
		s2=s2.toLowerCase();
		List<Character>a = new ArrayList<Character>();
		List<Character> a1 = new ArrayList<Character>();
		for(int i=0;i<s1.length();i++)
		{
		a.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++)
		{
		a1.add(s2.charAt(i));
		}
		Collections.sort(a);
		Collections.sort(a1);
		if (a.equals(a1))
		  {
			System.out.println("anagram");
		  } 
		else 
		  {
			System.out.println("not an anagram");
		  }

	}

}
