
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");
        // Map<String, Integer> map = new HashMap<>(); // this stores just key 2 after put, identityHashMap stores both after both put 
        Map<String, Integer> map = new IdentityHashMap<>(); // Identity hashmap ignores hashCode for bucket and equals for content check, it just uses == (address-wise key1 and key2 are diff since created using object constructor not string literal in the pool so they are different)
        map.put(key1, 1);
        map.put(key2, 2); // key2 goes into same bucket -> key2.equals(key1)[correct content-wise] -> means new value and replaces the other value and keeps the key
        System.out.println(key1 == key2); // two diff objects so false
        System.out.println(key1.equals(key2));// "key".equals("key") returns true (compares content)
        System.out.println(map);
    }

}
