
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

// Vector: legacy synchronized class that implements list interface
// It is useful in multi-threaded environment where thread safety is a concern
public class VectorDemo {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(10);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        System.out.println(vector.capacity()); // total elements it can contain 
        System.out.println(vector.size()); // total elements present 
        //Methods: get,set, remove(Object o), isEmpty,contains(Object o), clear
        // vector.clear();
        // System.out.println(vector);

        // Vector can also contain other Collection 
        //Collections nest because collections are objects, and collections store object references.
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        Vector<Integer> v1 = new Vector<>(linkedList);
        System.out.println(v1);

    }
}

//NOTE: ArrayList = speed without locks; Vector = locks with thread safety.
//Features: dynamic, synchronized, resizing mechanism and random access.
