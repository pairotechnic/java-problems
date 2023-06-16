package classesAndObjects;

import java.util.Scanner;

public class Area {

	static int length, breadth;
	
	public static void setDim(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		length = sc.nextInt();
		System.out.print("Enter breadth : ");
		breadth = sc.nextInt();
	}
	
	public static int getArea() {
		return length*breadth;
	}
	
	public static void main(String[] args) {
		setDim();
		System.out.println("Area of the rectangle : " + getArea());
	}
}

















