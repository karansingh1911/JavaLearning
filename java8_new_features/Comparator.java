
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparator is a functional interface, mostly used for doing an operation in a certain order 
// needs two values, for custom class objects we need to define it by using lambda expression, for Collection API its defined internally
public class Comparator {

    public static void main(String[] args) {

        List<Integer> lst = new ArrayList<>();

        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        System.out.println(lst);
        // gives sorted list -asc order
        Collections.sort(lst);
        // blackbox: b-a for desc. , a-b for asc.  
        Collections.sort(lst, (a, b) -> (b - a));
        System.out.println(lst);
    }
}
