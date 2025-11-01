
import java.util.Arrays;
import java.util.List;

public class OptionalDemo{
    public static void main(String[] args) {
        List<String> s = Arrays.asList("karan","kumar", "laxmi","rohan");

        String FirstX = s.stream()
                            .filter(str-> str.contains("X"))
                            .findFirst()  // findfirst gives optional
                            .orElse("String not found with the mentioned sub-string");
        System.out.println(FirstX);
    }

}