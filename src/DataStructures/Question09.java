package DataStructures;

import java.util.*;

public class Question09 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); // create list
		
		list.add("Apple"); //insert elements in list
		list.add("Banana");
		list.add("Cat");
		
		System.out.println("The list : " + list); // display list
		
		Collections.swap(list, 0, 2);
		
		System.out.println("The list after swap : " + list); // display list after swap
		
	}

}