package classesAndObjects;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinDiffPair {
	
	int arrayLength;
	int diff;
	int minDiffSmallerIndex;
	
	public void findPairs() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many integers in the array : "); // Get Array Length
		arrayLength = sc.nextInt();
		
		System.out.println("Enter " + arrayLength + " integers ->"); // Populate array
		int[] arr = new int[arrayLength];
		for (int i=0; i< arrayLength; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		diff = arr[1] - arr[0];
		minDiffSmallerIndex = 0;
		for (int i=0; i<arrayLength-1; i++) {
			if ((arr[i+1] - arr[i]) < diff) {
				diff = arr[i+1] - arr[i];
				minDiffSmallerIndex = i;
			}
		}
		
		System.out.println("The pair of elements with the maximum difference : " + arr[0] + " and " + arr[arrayLength-1]);
		System.out.println("The pair of elements with the minimum difference : " + arr[minDiffSmallerIndex] + " and " + arr[minDiffSmallerIndex+1]);
	}

	public static void main(String[] args) {
		MaxMinDiffPair mmdp = new MaxMinDiffPair();
		mmdp.findPairs();
		
	}

}

