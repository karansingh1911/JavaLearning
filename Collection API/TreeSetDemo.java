
import java.util.Set;
import java.util.TreeSet;
class TreeSetDemo{ 
    public static void main(String[] args) {
        Set<Integer> s= new TreeSet<>();
        s.add(1);
        s.add(11);
        s.add(12);
        s.add(10);
        s.add(1); // duplicate values not stored
        System.out.println(s); // no concept of index!

    }
}

//NOTE: To get values in sorted format use Tree set which can implement Set 