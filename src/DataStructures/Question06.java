package DataStructures;

import java.util.*;

public class Question06 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(6); //create list 
		// Why can't I write List<Integer> instead of ArrayList<Integer> on LHS
		
		
		list.add(70); // add elements
		list.add(30);
		list.add(90);
		list.add(20);
		list.add(10);
		list.add(80);
		
		System.out.println("Print list : " + list);
		
		list.ensureCapacity(8);
		
		list.add(15);
		list.add(18);
		
		System.out.println("Print expanded list : " + list);
		
		
	}

}