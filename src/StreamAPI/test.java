package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

public class test {

	public static String fixedLengthString(String string, int length) {
	    return String.format("%" + length + "1$" + "s", string);
	    
	}
	
	public static void main(String[] args) {
		
		
//		System.out.println(fixedLengthString("Hello", 15) + "I am Rohit");
		System.out.println(String.format("%-15s", "Hello") + "I am Rohit");
//		String.format("%-15s",s)
		
	}

}
