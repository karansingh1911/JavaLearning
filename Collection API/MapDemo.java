
import java.util.HashMap;
import java.util.Map;

public class MapDemo{
    public static void main(String[] args) {
        Map<Integer,String> m= new HashMap<>(); // use HashTable for synchronized version 
        m.put(1, "karan"); // Keys must be unique (set?), values can be repeated (List?)
        m.put(2, "Mohan");
        m.put(10, "Shyam");
        m.put(21, "Ram");

        System.out.println(m);
        for (Integer key : m.keySet() ){
            System.out.println("Key is: "+ key +" and value is: "+ m.get(key));

        }
        
    }
}