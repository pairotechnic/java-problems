package DataStructures;

import java.util.*;

public class Question21 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>(); 
		
		set.add(10); // add elements
		set.add(30);
		set.add(50);
		set.add(70);
		set.add(90);
		
		System.out.println("Print HashSet: " + set);
		
		System.out.println("\nDoes 30 exist in  the HashSet? " + set.contains(30));
		System.out.println("Does 15 exist in  the HashSet? " + set.contains(15));
		
	}

}