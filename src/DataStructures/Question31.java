package DataStructures;

import java.util.*;

public class Question31 {
	public static void main(String[] argv) throws Exception
	{
			Map<String, String> map = new HashMap<String, String>();
			
			// add elements into the Map
			map.put("1", "Alpha");
			map.put("2", "Beta");
			map.put("3", "Gamma");
			map.put("4", "Delta");
			map.put("5", "Epsilon");
			
			System.out.println("HashMap : " + map);
			
			// Synchronizing the map
			Map<String, String> syncMap = Collections.synchronizedMap(map);

			// printing the Collection
			System.out.println("Synchronized map : "+ syncMap);
	}
}
