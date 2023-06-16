package DataStructures;

import java.util.*;

public class Question12 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // create list
		
		list.add("Apple"); //insert elements in list
		list.add("Banana");
		list.add("Cat");
		
		System.out.println("The list : " + list); // display list
		
		String retrievedElement = list.get(1);
		
		System.out.println("Element at index 1 : " + retrievedElement);
		
	}

}