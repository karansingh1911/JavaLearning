// BIPredicate =  Predicate which can take 2 Objects of diff classes and return boolean

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> areBothEven = (a, b) -> (a % 2 == 0 && b % 2 == 0);
        System.out.println(areBothEven.test(2, 3));
        System.out.println(areBothEven.test(2, 4));

    }
}
