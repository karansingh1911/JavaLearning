//every functional Interface can be instantiated using a lambda expression as we saw when we created a functional Interface + lambda expression

// Predicate = boolean valued functional Interface which returns true or false and lambda needs a condition check for T
// Note: Two predicates can be tested together by using conjunctions - or, and 
// use negate().text for opposite condition check and it is usable on the Objects as well!
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        // returns true when value >10
        Predicate<Integer> valueGreaterThanTen = (x) -> x > 10;
        System.out.println(valueGreaterThanTen.test(11));
        Predicate<String> startsWithLetterK = x -> x.toUpperCase().startsWith(x);
        System.out.println(startsWithLetterK.test("Ram")); // returns false
    }
}
