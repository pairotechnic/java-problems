package DataStructures;

import java.util.*;

public class Question14 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // create list
		
		list.add("Apple"); //insert elements in list
		list.add("Banana");
		list.add("Cat");
		list.add("Dog");
		
		System.out.println("The list : " + list); // display list
		
		boolean doesListContainDog = list.contains("Dog");
		
		System.out.println("Does the list contain Dog? " + doesListContainDog);
	}

}