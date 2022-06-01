package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentdetails {
	private static personaldetails p;

	public static void main(String[] args) {
		System.out.println("enter the student details");

		List<personaldetails> studentList = new ArrayList<personaldetails>();
		Scanner scanner = new Scanner(System.in);
		// Scanner scanner1 = new Scanner(System.in);
		int n = scanner.nextInt();
		// int s1=scanner1.nextInt();
		for (int i = 0; i < n; i++) {
			personaldetails p = new personaldetails();
			System.out.print("Enter the RollNo: ");
			p.setRollNo(scanner.nextInt());
			System.out.print("Enter the Name: ");
			p.setName(scanner.next());
			System.out.print("Enter the Email Address: ");
			p.setEmail(scanner.next());
			System.out.print("Enter the Date Of Birth: ");
			p.setdOB(scanner.next());
			System.out.print("Enter the Branch: ");
			p.setBranch(scanner.next());
			System.out.println("Student details added successfully");
			studentList.add(p);
			System.out.println();
		}
		System.out.println();

		System.out.print("Enter the Student RollNo to be updated: ");
		int rollNo = scanner.nextInt();
		personaldetails s = null;
		for (personaldetails info : studentList) {
			if (info.getRollNo() == rollNo) {
				s = info;
				break;
			}
		}
		if (s == null) {
			System.out.println("Student details not found!");
			System.out.println();
		} else {
			System.out.println("Enter new Email Address: ");
			s.setEmail(scanner.next());
			System.out.println("Enter new DOB: ");
			s.setdOB(scanner.next());
			System.out.println("DOB updated successfully");

			System.out.println();
			System.out.println("Updated Info: ");
			display(s);
		}

		System.out.println("enter the position");
		int position = scanner.nextInt();
		int index = position - 1;
		System.out.println("enter the roll no");
	     s.setRollNo(scanner.nextInt());

		System.out.println("Enter new DOB: ");
		s.setdOB(scanner.next());

		if (index >= studentList.size() && index > 0) {
			studentList.add(s);
		} else {
			studentList.add(index, s);

			System.out.println(s.getRollNo() + " " + s.getName());
		}
		display(s);
	}

	private static void display(personaldetails s) {
		System.out.println("Name: " + s.getName());
		System.out.println("Email: " + s.getEmail());
		System.out.println("Roll No: " + s.getRollNo());
		System.out.println("DOB: " + s.getdOB());
		System.out.println();
	}
}
