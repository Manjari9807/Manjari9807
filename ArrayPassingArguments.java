package practice;


	public class ArrayPassingArguments {
		String name;int age;float per;
		public ArrayPassingArguments(String name,int age,float per)
		{
		this.name=name;
		this.age=age;
		this.per=per;
		}
		public static void main(String[] args)
		{
			ArrayPassingArguments std[]=new ArrayPassingArguments[3];//i created a students array
		std[0]=new ArrayPassingArguments("Ravi",27,81.2f);
		std[1]=new ArrayPassingArguments("Rohan",23,77.5f);
		std[2]=new ArrayPassingArguments("Riya",21,77.9f);
		details(std);//call details method and pass array as arguments
		}
		public static void details(ArrayPassingArguments std[])
		//Students sarray[]=new Students[3]
		{
		System.out.println("Name Age percentage");
		for(ArrayPassingArguments s1:std)
		{
		System.out.println(s1.name+" "+ s1.age+" "+s1.per);
		}
		}
		} 

