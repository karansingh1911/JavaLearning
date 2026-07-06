// Hash function:  takes a String and returns a fixed size Integer (32 or 64 bit )
// Benefits of hash functions:  Fixed output size, deterministic, efficient computation
// Treefication: The bucket stores the elements as linked list O(n), after java 8 whenever the length of this linked list >8 the internal structure converts itself into Red Black tree(Balanced binary search tree O(logn)).

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo { // load factor for resizing : 0.75, after that it doubles 

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>(); // default capacity= 16
        hashMap.put(11, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(18, "d");
        System.out.println(hashMap);

        System.out.println(hashMap.get(1)); // how to get value for a key
        System.out.println(hashMap.values()); // how to get all the values 
        Set<Integer> keys = hashMap.keySet(); // get all the keys
        System.out.println(keys.getClass()); // returns a inner-class that implements set internally

        for (Integer i : keys) {
            System.out.println(i + i);
        }
        System.out.println(hashMap.containsValue("Karan"));
        System.out.println(hashMap);
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(entries);
    }
}

// Unordered: Only one entry can exist with null key
// Null Keys: doesn't maintain any order
// Not synchronized: not thread safe
// Performance:  Get,Put - O(1); assuming hash function disperses elements properly
//NOTE: before java 7 the buckets stored the entries in LL, in java 8+
// Data retrieval: Key is hashed  -> index is found -> then bucket is searched.
//NOTE: when trying to store any custom class in the hashmap, its necessary to override the equals method and the hashCode method 
// We override equals() -> To define what "same key" means according to business logic.
//We override hashcode() ->To ensure that logically equal objects are placed in the same bucket and to distribute keys efficiently across buckets.

