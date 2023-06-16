package DataStructures;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.Random;

public class Question32 {
	public static void main(String[] args)
	{
		Set<String> cset = new LinkedHashSet<>();

		// Adding elements to LinkedHashSet
		cset.add("Paneer Butter Masala");
		cset.add("Paneer Lababdar");
		cset.add("Kadai Paneer Gravy");
		cset.add("Malai Kofta Curry");
		cset.add("Palak Paneer");
		cset.add("Mughlai Shahi Paneer");
		cset.add("Restaurant Style Chilli Paneer");
		cset.add("Restaurant Style Matar Paneer");
		cset.add("Paneer Tikka Masala");
		cset.add("Paneer Makhani");
		cset.add("Achari Paneer Gravy");

		// This will generate a random number
		// between 0 and LinkedHashSet size()
		Random random = new Random();
		int randomNumber = random.nextInt(cset.size());

		// maintaining the index
		int count = 0;
		for (String s : cset) {
		
			// when ever our index counter variable "count"
			// will be equal to the random number it will
			// print the element at that position in the
			// LinkedHashSet and after printing we will break
			// the loop
			if (count == randomNumber) {
				System.out.println(s);
				break;
			}
			count++;
		}
	}
}
