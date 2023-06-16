package DataStructures;

//Java program demonstrate how to Sort LinkedHashSet using
//Comparable interface
import java.util.*;

//Stud class implements comparable interface
class Stud implements Comparable<Stud> {
	
	Integer marks;

	Stud(Integer marks) {  // parameterized constructor
		this.marks = marks; 
	}

	// override toString method
	public String toString() { 
		return (" " + this.marks); 
	}

	// Override compareTo method to sort LinkedHashSet in
	// ascending order
	public int compareTo(Stud stu){
		return this.marks.compareTo(stu.marks);
	}
}

public class Question37 {
	public static void main(String[] args){

		// New LinkedHashSet
		LinkedHashSet<Stud> set = new LinkedHashSet<>();

		// Adding elements to the set
		set.add(new Stud(500));
		set.add(new Stud(300));
		set.add(new Stud(400));
		set.add(new Stud(100));
		set.add(new Stud(200));

		// Print Before sort
		System.out.println("Before sort elements in ascending order : " + set);

		// TreeSet to sort LinkedHashSet using comparable
		TreeSet<Stud> tree_set = new TreeSet<>(set);

		// Print after sorting
		System.out.println("After sort elements in ascending order : " + tree_set);
	}
}

