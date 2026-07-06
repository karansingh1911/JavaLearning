// Here the order is preserved in the insertion order, not thread-safe.
// Bucket level: Single LL, Global Insertion-order connection : DLL.

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> fruits = new LinkedHashMap<>(11, 0.3f, true); // (initial capacity,load factor, access order: false)
        fruits.put("Apple", 1);
        fruits.put("Mango", 20);
        fruits.put("Banana", 13);
        fruits.put("Peer", 30);

        fruits.get("Banana");
        for (Map.Entry<String, Integer> fruit : fruits.entrySet()) {
            System.out.println(fruit);

        }
        for (Map.Entry<String, Integer> fruit : fruits.entrySet()) {
            System.out.println(fruit);
        }
        System.out.println(fruits.getOrDefault("Cherry", 0));
        System.out.println(fruits.putIfAbsent("Cherry", 100));

        for (Map.Entry<String, Integer> fruit : fruits.entrySet()) {
            System.out.println(fruit);

        }

    }

}

//useCase: use when order matters and it will take slightly more memory.
//Access order : when set true the element most recently accessed is set to last. node of the doubly LinkedList (LRU).
