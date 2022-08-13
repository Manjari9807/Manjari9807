import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeMap;;
public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeMap<Integer,String> m1=new TreeMap<>();
//		 m1.put(101,"Rahul");
//		 m1.put(102,"Riya");
//		 m1.put(103,"Pooja");
//		 System.out.println(m1);
//		 System.out.println(m1.keySet());
//		 System.out.println(m1.value());
//		 System.out.println( m1.get(101));
//		 System.out.println(m1.get(334));
//		 System.out.println(m1.containsKey(1002));
//		 System.out.println(m1.containsValue("Java"));
//		 m1.put(101,"Sanju");
//		 m1.put(103,"Pooja1.0");
//		 System.out.println("After adding duplicate keys"+m1);
//		 m1.put(null,"Pooja2.0");
//		 System.out.println(m1);
//		 m1.put(null,"Pooja3.0");
//		 System.out.println(m1); 
		
		ArrayDeque<String> animals= new ArrayDeque<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        Iterator<String> desIterate =  animals.descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
		
		
		
	}

}
