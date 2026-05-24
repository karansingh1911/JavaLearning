
import java.util.ArrayList;

// List(Interface): Arraylist, LinkedList, Vector, Stack.
// Key features(ArrayList): Order preservation, Index-based Access, Allows duplicates
// Use-case: When we want elements according to insertion order and want to keep duplicates we use List
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // default capacity = 10
        //ArrayList<Integer> list = new ArrayList<>(initial capacity);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(1));
        System.out.println(list.size());
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println(list.contains(1));
        list.remove(1);
        list.add(1, 5); // to replace the element at index with some value use - .set()
        System.out.println(list);

    }
}

// ArrayList: resizable array impl. of list interface ; use when number of elements in list isn't known in advance
// Initial capacity=10, Growth factor= 1.5, Copying Elements O(n) time to copy 
//Time Complexity
//1. Access by index(.get())= O(1)
//2. Adding/removing an element, worst case will cause resizing = O(n)
//Iteration= O(1)
