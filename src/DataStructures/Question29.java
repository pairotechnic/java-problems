package DataStructures;

import java.util.*;
import java.util.Map.Entry;


public class Question29 {
    public static void main(String[] args) {
    	
        HashMap<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        map.put("A", 5);
        map.put("B", 7);
        map.put("C", 3);
        map.put("D", 1);
        map.put("E", 2);
        map.put("F", 8);
        map.put("G", 4);
        
        System.out.println("Unsorted HashMap : " + map);
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        
        System.out.println("Hashmap values pushed in list");
        
        
        Collections.sort(list); 
        
        System.out.println("List sorted");
        
        for (int num : list) {
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        
        System.out.println("List pushed in LinkedHashMap to preserve order");
        
        System.out.println("Sorted (by value) LinkedHashMap : " + sortedMap);
        
        System.out.println("LinkedHashMap printed");
    }
}