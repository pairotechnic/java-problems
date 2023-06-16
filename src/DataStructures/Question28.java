package DataStructures;
 
import java.util.*;
 
public class Question28 {
 
    public static void main(String[] args) {
 
        // creating TreeMap object of type <String, String>
        Map<String, String> tMap = new TreeMap<String, String>();
 
        // adding key-value pairs to TreeMap object
        tMap.put("USA", "USD");
        tMap.put("India", "INR");
        tMap.put("UK", "GBP");
        tMap.put("Japan", "JPY");
        tMap.put("UAE", "AED");
 
        // Get keySet() and Iterate using for-each loop
        System.out.println("Get keySet() and" + " Iterate using for-each loop\n");
 
        // getting keySet() into Set
        Set<String> set1 = tMap.keySet();
 
        // for-each loop
        for(String key : set1) {
            System.out.println("Key : "  + key + "\t\t" + "Value : "  + tMap.get(key));
        }
    }
}