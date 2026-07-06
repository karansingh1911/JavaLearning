
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// A map which cannot be instantiated after initialization once is called Immutable hashMap
public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1= new HashMap<>();
        map1.put(1, "Karan");
        map1.put(2, "Ram");
        map1.put(4, "Raman");
        map1.put(3, "Ayush");
        Map<Integer, String> map2 = Collections.unmodifiableMap(map1);
        //map2.put(10, "What"); // java.lang.UnsupportedOperationException
        System.out.println(map1);
        System.out.println(map2);
        // Java 9, .of() ; since here map1 is still appendable, since its a mutable view still 
        Map<Integer, String> immutableMap = Map.of(1, "Ram", 2, "Shyam"); // limit of 10 pairs only (key,value)
        Map<Integer, String> iMap = Map.ofEntries(Map.entry(1, "karan"), Map.entry(2, "Rohan"), Map.entry(3, "karan"));
        System.out.println(iMap);

    }
}