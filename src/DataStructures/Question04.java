package DataStructures;

import java.util.*;

public class Question04 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>(); //create list
		
		list.add(70); // add elements
		list.add(30);
		list.add(90);
		list.add(20);
		list.add(10);
		list.add(80);
		
		System.out.println("Print list : " + list);
		
		Collections.sort(list);
		
		System.out.println("Print sorted list : " + list);
		
		
		
	}

}
