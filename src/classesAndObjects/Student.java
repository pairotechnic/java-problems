package classesAndObjects;

import java.util.Scanner;

public class Student {

	String name;
	int roll_no;
	
	public void setInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("Roll no : ");
		roll_no = sc.nextInt();
		System.out.println();
	}
	
	public void getInfo(){
		System.out.println("After input ...\n");
		System.out.println("Name : " + name);
		System.out.print("Roll no : " + roll_no);
	}
	
	public static void main(String[] args) {
		
		Student std = new Student();
		std.setInfo();
		std.getInfo();
	}
}
