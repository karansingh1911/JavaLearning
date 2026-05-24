
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

// UnaryOperator Interface: Use when same class type accepted(T) and returned(T) 
//Function<T,T> = UnaryOperator<T> (minimal)
public class OperatorsDemo {

    public static void main(String[] args) {
        UnaryOperator<Integer> addThousandOperator = (x) -> x + 1000;
        System.out.println(addThousandOperator.apply(100));
        //BinaryOperator Interface: Use when you need BiFunction with two same types accepted and returned (T,T,T)
        //BiFunction<T,T,T> = BinaryOperator<T> (minimal)
        BinaryOperator<String> stringConcatBinaryOperator = (str1, str2) -> str1.concat(str2);
        System.out.println(stringConcatBinaryOperator.apply("kar", "an"));

    }
}
