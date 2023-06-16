package DataStructures;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
public class Question53 {
 
    public static void main(String[] args) {
 
        // create LinkedHashMap object of type <String, String>
        Map<String, String> linkMap = new LinkedHashMap<String, String>();
 
        // adding key-value pairs to LinkedHashMap object
        linkMap.put("Google", "Sundar Pichai");
        linkMap.put("Facebook", "Mark Zuckerberg");
        linkMap.put("LinkedIn", "Reid Hoffman");
        linkMap.put("Apple Inc", "Tim Cook");
        linkMap.put("Microsoft", "Bill Gates");
        linkMap.put("Amazon", "Jeff Bezos");
        linkMap.put("Oracle", "Larry Ellison");
 
        System.out.println("Before Sorting by Values -" + " as per insertion-order : \n");
 
        // iterate original LinkedHashMap
        for(Map.Entry<String, String> lhmap : linkMap.entrySet()){
            System.out.println("Key : "  + lhmap.getKey() + "\t\t" + "Value : "  + lhmap.getValue());
        }
 
 
        // 1. get entrySet from LinkedHashMap object
        Set<Map.Entry<String, String>> companyFounderSet = linkMap.entrySet();
 
 
        // 2. convert LinkedHashMap to List of Map.Entry
        List<Map.Entry<String, String>> companyFounderListEntry = new ArrayList<Map.Entry<String, String>>( companyFounderSet);
 
 
        // 3. sort list of entries using Collections class'
        // utility method sort(ls, cmptr)
        Collections.sort(companyFounderListEntry, new Comparator<Map.Entry<String, String>>() {
 
            @Override
            public int compare(Entry<String, String> es1, Entry<String, String> es2) {
                return es1.getValue().compareTo(es2.getValue());
            }
        });

        // 4. clear original LinkedHashMap
        linkMap.clear();
 
        // 5. iterating list and storing in LinkedHahsMap
        for(Map.Entry<String, String> map : companyFounderListEntry){
            linkMap.put(map.getKey(), map.getValue());
        }
 
        System.out.println("\n\nSorted LinkedHashMap by its Values" + " in ascending-order\n");
 
        // 6. iterate LinkedHashMap to retrieved stored values
        for(Map.Entry<String, String> lhmap : linkMap.entrySet()){
            System.out.println("Key : "  + lhmap.getKey() + "\t\t" + "Value : "  + lhmap.getValue());
        }
    }
}