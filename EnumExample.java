package practice;
enum size{
	small,large,extralarge,medium;
}
class EnumExample
{
    size pizzasize;
    public EnumExample(size pizzasize)
    {
    this.pizzasize=pizzasize;
}
    public void OrderPizza()
    {
    	switch(pizzasize)
    	{
    	case small:
    		System.out.println("your order is small");
    	case large:
    		System.out.println("your order is small");
    	case medium:
    	System.out.println("your order is medium");
    	}
    }
static class Test {
public static void main(String[] args) 
{
	EnumExample t1=new EnumExample(size.medium);
	t1.OrderPizza();
}
}
}
