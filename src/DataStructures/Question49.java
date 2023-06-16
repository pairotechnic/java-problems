package DataStructures;

import java.util.*;

public class Question49 {
	
   public static void main(String args[]) {
	   
      // Create a hash map
      HashMap hm = new HashMap();
      
      // Put elements to the map
      hm.put("Bag", new Integer(1100));
      hm.put("Sunglasses", new Integer(2000));
      hm.put("Frames", new Integer(800));
      hm.put("Wallet", new Integer(700));
      hm.put("Belt", new Integer(600));
      
      // Get a set of the entries
      Set set = hm.entrySet();
      System.out.println("Elements in HashMap...");
      
      // Get an iterator
      Iterator i = set.iterator();
      
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      
      System.out.println();
      
      System.out.println("The value for key Frames in the HashMap = "+hm.get("Frames"));
   }
}
