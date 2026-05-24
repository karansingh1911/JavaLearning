//BiFuntion<T,U,R> :  T,U = two different class objects and R = return type

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<String, String, String> stringAdder = (str1, str2) -> str1 + str2;
        System.out.println(stringAdder.apply("karan", "singh"));

    }
}
