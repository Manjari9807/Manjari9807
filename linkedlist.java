import java.util.LinkedList;
public class linkedlist {
	public static void main(String[] args)
	{
		LinkedList<Object>m=new LinkedList<Object>();
		m.add('a');
		m.add(5);
		m.add(1);
		
		System.out.println(m.contains(5));
		System.out.print(m);
		Object value=m.get(2);
	    m.set(2,value +"5");
	    System.out.println(m);
	    System.out.print(m.stream());
	}

	

}
