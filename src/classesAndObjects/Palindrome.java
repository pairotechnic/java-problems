package classesAndObjects;

import java.util.Scanner;

public class Palindrome {
	
	int arrayLength;
	boolean isPalindrome = true;
	
	public void checkPalindrome() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many integers in the array : "); // Get Array Length
		arrayLength = sc.nextInt();
		
		System.out.println("Enter " + arrayLength + " integers ->"); // Populate array
		int[] arr1 = new int[arrayLength];
		for (int i=0; i< arrayLength; i++) {
			arr1[i] = sc.nextInt();
		}
		
		for (int i=0; i<((arrayLength+1)/2); i++) { // Check if array is Palindrome or not
			if (arr1[i] != arr1[(arrayLength - i) - 1]) {
				isPalindrome = false;
			}
		}
		
		if (isPalindrome == false) {  // Print result
			System.out.println("It is not a palindrome array");
		}
		else {
			System.out.println("It is a palindrome array");
		}
	}

	public static void main(String[] args) {
		Palindrome pdr = new Palindrome();
		pdr.checkPalindrome();
	}

}
