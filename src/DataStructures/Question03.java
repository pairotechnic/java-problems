package DataStructures;

import java.util.*;

public class Question03 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); //create list
		
		list.add(10); // add elements
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println("Print list : " + list);
		
		list.remove(5);
		
		System.out.println("Print list after removal : " + list);
		
	}

}
