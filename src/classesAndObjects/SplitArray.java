package classesAndObjects;

import java.util.Scanner;

public class SplitArray {
	
	int[] arr = new int[10];
	int[] arr1 = new int[5];
	int[] arr2 = new int[5];
	
	
	public void setArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements : ");
		for (int i = 0; i< 10; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public void splitAndSave() {
		for (int i = 0; i< 5; i++) {
			arr1[i] = arr[i];
		}
		for (int i = 5; i< 10; i++) {
			arr2[i-5] = arr[i];
		}
	}
	
	public void printArrays() {
		System.out.print("original array : ");
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		System.out.print("First half array : ");
		for (int i : arr1) {
			System.out.print(i);
		}
		System.out.println();
		System.out.print("Second half array : ");
		for (int i : arr2) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		SplitArray sa = new SplitArray();
		sa.setArray();
		sa.splitAndSave();
		sa.printArrays();
		
	}

}
