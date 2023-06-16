package classesAndObjects;

import java.util.Scanner;

class StudentHeight{
	
	static int total_height;
	static float  average_height;
	int height;
	
	void getStudentHeight(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student height : ");
		height = sc.nextInt();
	}
	
	static void showAverageHeight() {
		System.out.println("Average height of students is : " + average_height);
	}
	
}

public class AverageHeight {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many students in the class? : " );
		int numOfStudents = sc.nextInt();
		
		StudentHeight[] std = new StudentHeight[numOfStudents];
		
		for (int i=0; i<numOfStudents; i++) {
			std[i] = new StudentHeight();
		}
		
		for (int i=0; i<numOfStudents; i++) {
			std[i].getStudentHeight();
			StudentHeight.total_height += std[i].height;
		}
		
		StudentHeight.average_height = (float)StudentHeight.total_height / numOfStudents;
		
		StudentHeight.showAverageHeight();
	}

}
