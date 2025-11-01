
import java.util.*; 

public class ListDemo{ // Elements in the ArrayList cannot be fetched by Index 
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>(); 
        // before java 7 we used to do new ArrayList<Integer>() on RHS for declaration.
        ls.add(4);
        ls.add(10);
        ls.add(20);
        ls.add(9);
        ls.add(1);
        System.out.println(ls.indexOf(10));
        System.out.println(ls.get(3));
        

    }
}