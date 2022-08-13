package consoledone;
import java.util.Scanner;
class Student {
	private String name;
	private int age;
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class ArrayObject {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of candidates : ");
		int n = in.nextInt();
		Student[] stu = new Student[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the name : ");
			String name = in.next();
			System.out.println("Enter the age : ");
			int age = in.nextInt();
			stu[i] = new Student(name, age);
		}
		for (Student j : stu) {
			System.out.print("name : " + j.getName());
			System.out.println("Age : " + j.getAge());
		}
	}
}