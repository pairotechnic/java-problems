package classesAndObjects;

import java.util.Scanner;

class Studentwithrollno{
	
	int rollno, sub1, sub2, sub3;
	float avg;
	
	Studentwithrollno(){
		
	}
	
	void setStudentInfo(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll number : ");
		rollno = sc.nextInt();
		System.out.print("Enter subject 1 marks : ");
		sub1 = sc.nextInt();
		System.out.print("Enter subject 2 marks : ");
		sub2 = sc.nextInt();
		System.out.print("Enter subject 3 marks : ");
		sub3 = sc.nextInt();
		avg = (float)(sub1 + sub2 + sub3)/3;
	}
	
	void showStudentInfo() {
		System.out.println("Roll no : " + rollno);
		System.out.println("Average : " + avg + "\n");
	}
	
	
	
}

public class AverageMarks8Students {

	public static void main(String[] args) {
		
		Studentwithrollno[] std = new Studentwithrollno[8];
		
		for (int i=0; i<8; i++) {
			std[i] = new Studentwithrollno();
		}
		
		for (int i=0; i<8; i++) {
			std[i].setStudentInfo();
		}
		
		System.out.println();
		
		for (int i=0; i<8; i++) {
			std[i].showStudentInfo();
		}
		
	}

}
