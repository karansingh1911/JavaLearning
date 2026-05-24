
import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<String, String> stringSaver = (str1, str2) -> System.out.println(str1 + " " + str2 + " saved in the memory ");
        stringSaver.accept("Ram", "Teacher");
    }
}
