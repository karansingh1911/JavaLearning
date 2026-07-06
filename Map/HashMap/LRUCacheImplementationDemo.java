
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<Integer, String> extends LinkedHashMap<Integer, String> {

    private final int capacity = 3;

    public LRUCache() {
        super(3, 0.75f, true);
    }

    @Override // this method is invoked when put() or putAll() is run 
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return this.size() > capacity;
    }

}

public class LRUCacheImplementationDemo {

    public static void main(String[] args) {
        LRUCache<String, Integer> cache = new LRUCache<>();

        cache.put("Apple", 1);
        cache.put("Mango", 20);
        cache.put("Banana", 13);
        for (Map.Entry<String, Integer> fruit : cache.entrySet()) {
            System.out.println(fruit);

        }
        // after get() the recently used item will be pushed to last
        cache.get("Mango");
        for (Map.Entry<String, Integer> fruit : cache.entrySet()) {
            System.out.println(fruit);

        }
        cache.put("Peer", 30);
        for (Map.Entry<String, Integer> cacheItem : cache.entrySet()) {
            System.out.println(cacheItem);
        }

    }

}
