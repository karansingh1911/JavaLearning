
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Collection  -> Stream -> Declarative and functional approach(map.filter,reduce,...)
// Benefits of Stream API   -> Readability, Flexibility, Parallelism, Encapsulation
// Note: only terminal operations trigger stream processing : forEach, collect, count, reduce, findFirst, anyMatch
// Intermediate operations : filter, map, reduce, distinct, peek, limit, skip, sorted
public class StreamsDemo {

    public static void main(String[] args) {
        // creating stream using .stream()
        List<String> names = List.of("karan", "ram", "shyam");
        Stream<String> students = names.stream();
        // using Arrays.stream()
        Stream<String> teachers = Arrays.stream(names.toArray(String[]::new));
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 5, 6);
        int num = nums.stream().filter(x -> x % 2 == 0).map(x -> x * 2).distinct().sorted((a, b) -> (a - b)).limit(4).peek(x -> System.out.println(x)).skip(1).min((a, b) -> a - b).get();
        System.out.println(num);

    }
}
