package DataStructures;

import java.util.*;

public class Question13 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // create list
		
		list.add("Apple"); //insert elements in list
		list.add("Banana");
		list.add("Cat");
		
		System.out.println("The list : " + list); // display list
		
		list.set(2,  "Xavier");
		
		System.out.println("The updated list : " + list); // display updated list
		
	}

}