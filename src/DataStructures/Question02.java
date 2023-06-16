package DataStructures;

import java.util.*;

public class Question02 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // create list
		
		list.add("Apple"); //insert elements in list
		list.add("Banana");
		list.add("Cat");
		
		System.out.println("The list : " + list); // display list
		
		list.add(0, "Zebra"); // insert element at 0th index
		
		System.out.println("Updated list : " + list); // display updated list
		
	}

}

