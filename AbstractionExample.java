package practice;
abstract class motorcycle
{
	abstract public void brake() ;
	public void act();
	public void work()
	{
		System.out.println("working good");
	}
}
class BrakeCycle extends motorcycle
{
	public void act()
	{
		System.out.println("super act");
	}
}
public class AbstractionExample {

	public static void main(String[] args) {
		BrakeCycle b=new BrakeCycle();
		b.act();
b.work();
	}

}
