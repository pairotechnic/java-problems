package DataStructures;

import java.util.*;

public class Question27 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Apple"); 
		list.add("Cat");
		list.add("Fortune");
		list.add("Elephant");
		list.add("Banana");
		
		System.out.println("The list : " + list);
		
		Collections.reverse(list);
		
		System.out.println("The list after reversal : " + list);
		
	}
}
