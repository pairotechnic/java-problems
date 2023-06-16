package DataStructures;

//Java program to find the element
//index in LinkedHashSet
import java.util.*;

public class Question34 {
	public static void main(String[] args)
	{

		// New empty HashSet
		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		// Add elements to set
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(50);
		set.add(30);
		set.add(20);
		set.add(50);

		// Convert LinkedHashSet to ArrayList
		ArrayList<Integer> elements = new ArrayList<>(set);

		// Print the LinkedHashSet
		System.out.println("LinkedHashSet: " + set);

		// Print index of all the elements
		for (Integer x : elements) {
			System.out.println("Index of " + x + ": " + elements.indexOf(x));
		}

		// It returns -1 because 60 not present in
		// LinkedHashSet
		System.out.println("Index of " + 60 + ": " + elements.indexOf(60));
	}
}

