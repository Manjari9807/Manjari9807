package practice;
class Working implements car
{
	public void getdesign()
	{
		System.out.println("overview");
	}
}

public class AnonymousExample {

	public static void main(String[] args) 
	{
		Working s=new Working();
		s.getdesign();
		car c=new car()
		{
	public void getdesign()
	{
		System.out.println("blueprint");
	}
		};
		c.getdesign();
		}	
	
}

