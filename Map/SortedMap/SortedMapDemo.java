// interface that extends map and guarantees entries are sorted based on keys natural ordering or specified comparator
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class SortedMapDemo {

    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new SortedMap<String, Integer>() {

            @Override
            public int size() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'size'");
            }

            @Override
            public boolean isEmpty() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
            }

            @Override
            public boolean containsKey(Object key) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'containsKey'");
            }

            @Override
            public boolean containsValue(Object value) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'containsValue'");
            }

            @Override
            public Integer get(Object key) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'get'");
            }

            @Override
            public Integer put(String key, Integer value) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'put'");
            }

            @Override
            public Integer remove(Object key) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'remove'");
            }

            @Override
            public void putAll(Map<? extends String, ? extends Integer> m) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'putAll'");
            }

            @Override
            public void clear() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'clear'");
            }

            @Override
            public Comparator<? super String> comparator() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'comparator'");
            }

            @Override
            public SortedMap<String, Integer> subMap(String fromKey, String toKey) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'subMap'");
            }

            @Override
            public SortedMap<String, Integer> headMap(String toKey) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'headMap'");
            }

            @Override
            public SortedMap<String, Integer> tailMap(String fromKey) {
                 
                throw new UnsupportedOperationException("Unimplemented method 'tailMap'");
            }

            @Override
            public String firstKey() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'firstKey'");
            }

            @Override
            public String lastKey() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'lastKey'");
            }

            @Override
            public Set<String> keySet() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'keySet'");
            }

            @Override
            public Collection<Integer> values() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'values'");
            }

            @Override
            public Set<Entry<String, Integer>> entrySet() {
                 
                throw new UnsupportedOperationException("Unimplemented method 'entrySet'");
            }

        };
    }
}
//SortedMap -> Interface that extends map, guarantees that he entries are sorted based on the keys, either in their natural ordering or by specified comparator.  
