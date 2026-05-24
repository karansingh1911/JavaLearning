// compare(a,b) ->  a comes before b(if negative) / a comes after b (if positive)

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Compares two object of same data-types and determines the order
class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();

    }

}

public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Karan", "Rama", "Shyama");
        stringList.sort(new CustomComparator());
        System.out.println(stringList);

    }
}
