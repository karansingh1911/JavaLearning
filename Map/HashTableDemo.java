
//no null key or values
//Legacy class
//synchronized and slower than HashMap

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) { // same mechanism of buckets, only LL in case of collision
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "karan");
    }
} 