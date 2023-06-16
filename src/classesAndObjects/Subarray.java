package classesAndObjects;

import java.util.*;

public class Subarray {
	
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60}; 
        int subarr[] = Arrays.copyOfRange(arr, 3, 8);
        System.out.println("Sub array from index 3 to 8 : ");
        for (int i : subarr) {
        	System.out.print(i + "\t");
        }	
	}
}
