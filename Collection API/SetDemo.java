


// set is a collection of unique values 
// values aren't sorted and in random order
// Set is a interface and can be instantiated using HashSet()
import java.util.HashSet;
import java.util.Set;
class SetDemo{ 
    public static void main(String[] args) {
        Set<Integer> s= new HashSet<>();
        s.add(1);
        s.add(11);
        s.add(12);
        s.add(10);
        s.add(1); // duplicate values not stored
        System.out.println(s); // no concept of index!

    }
}

//NOTE: To get values in sorted format use Tree set which can implement Set 