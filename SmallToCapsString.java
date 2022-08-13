
public class SmallToCapsString {
	public static void main(String[] args) {
		String s="Paayilagam";
		char[] ch=s.toCharArray();
		System.out.println(ch);
		ch[3]=(char)(ch[3]-32);
		System.out.println(ch);
		
		
	}
}
