package DataStructures;

import java.util.*;

public class Question11 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // create list
		
		list.add("Apple"); //insert elements in list
		list.add("Banana");
		list.add("Cat");
		
		System.out.println("The list : " + list); // display list
		
		list.clear();
		
		System.out.println("The cleared list : " + list); // display list after emptying
		
	}

}