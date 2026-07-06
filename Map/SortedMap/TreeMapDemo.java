
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
    
    NavigableMap <String, Integer> map = new TreeMap<>(); // constuctor takes comparator for sorting order ((a,b)-> ()b-a)
        // strings are sorted in first letter, numbers in asc
        map.put("Karan", 101);
        map.put("Ram", 56);
        map.put("Shyam", 11);
        map.put("Rahim", 169);
        System.out.println(map);

        //Extra features provided over Map interface
        System.out.println(map.firstKey());
        System.out.println(map.firstEntry());
        System.out.println(map.lastKey());
        System.out.println(map.lastEntry());
        System.out.println(map.headMap("Shyam"));
        System.out.println(map.tailMap("Shyam"));
        // NavigableMap provides additional features : finding the closest matching key or retrieving the map in reversed order 

        // returns key smaller than passed key
        System.out.println(map.lowerKey("Shyam")); // excluding passed key
        // returns the least key greater than the passed key
        System.out.println(map.ceilingKey("Karan")); // or equal (including passed key)
        



        
    }
} 