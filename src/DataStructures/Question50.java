package DataStructures;

import java.util.*;

public class Question50 {
   public static void main(String args[]) {
	   
      // Create hash map
      HashMap hm = new HashMap();
      
      // Populate HashMap
      hm.put("Wallet", new Integer(700));
      hm.put("Belt", new Integer(600));
      hm.put("Backpack", new Integer(1200));
      
      // Print HashMap
      System.out.println("Map = "+hm);
      
      // Print all keys
      System.out.println("\nKeys...\n");
      Set keys = hm.keySet();
      Iterator i = keys.iterator();
      while (i.hasNext()) {
         System.out.println(i.next());
      }
   }
}
