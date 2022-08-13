
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.Size2DSyntax;

public class duplicate {

	public static void main(String[] args) {
		List<String> s1 = new ArrayList<String>();
		s1.add("This");
		s1.add("is");
		s1.add("Zoho");
		s1.add("and");
		s1.add("Zoho");
		s1.add("is");
		s1.add("good");

		Set<String> s = new LinkedHashSet<String>(s1);
		System.out.println();

		for (Object s2 : s)

			System.out.print(s2 + " ");

	}
}
