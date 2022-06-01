package practice;

class Grandfatheri {
	public void speak() {
		System.out.println("Hi! son");
	}
}

class Son extends Grandfatheri {
	public void speak() {
		super.speak();
		System.out.println("hi! Grandfather.how are you?");
	}
}

public class Grandfather1
{

	public static void main(String [] args)
    {
    	System.out.println(" conversation between grandfather and son");
        Son s=new Son();
        s.speak();
    }
}
