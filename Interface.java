package practice;
interface Language1
{
	public void getlanguage();
}
interface Language2 
{
	abstract public void geteasy();
	public void getfrequent();
}
class English implements Language1,Language2
{
	
	public void getlanguage()
	{
		System.out.println("English is the basic language for everyone");
	}

	
	/*public void geteasy() {
		System.out.println("but it is easy to learn");
		
	}*/
	public void getfrequent() {
		System.out.println("but it is easy to learn");
}


	

	
}
public class Interface {
	public static void main(String[] args) {
		English e=new English();
		e.getlanguage();
		e.getfrequent();
		//e.geteasy();
		
	}

}
