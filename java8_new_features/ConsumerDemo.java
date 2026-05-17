// Consumes data and returns nothing(void return type), but does something 
//Use-case: for incorporating side-effects 

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        // s consumed and worked upon
        Consumer<String> consumerStartsWithK = s -> System.out.println(s.startsWith("K"));
        Consumer<String> consumerEndsWithN = s -> System.out.println(s.endsWith("K"));
        consumerStartsWithK.andThen(consumerEndsWithN).accept("Karan");

    }
}
