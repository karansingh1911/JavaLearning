// all are there and we don't need to do import java.util.ArrayList
// but it's better to import them explicitly!

import java.util.*; 

public class ArrayListDemo{ // Elements in the ArrayList cannot be fetched by Index 
    public static void main(String[] args) {
        Collection<Integer> arr = new ArrayList<>(); 
        // before java 7 we used to do new ArrayList<Integer>() on RHS for declaration.
        arr.add(4);
        arr.add(10);
        arr.add(20);
        arr.add(9);
        arr.add(1);
        System.out.println(arr);
        

    }
}