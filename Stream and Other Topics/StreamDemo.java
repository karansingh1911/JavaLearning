import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamDemo{
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,10,6,5,7);
        Stream<Integer> s= nums.stream();
        // once a stream is declared and used it cannot be used again => can be used only once
        // s.forEach(num-> System.out.println(num));
        // //useCase
        // s.filter(num-> num%2==0);
        // s.map(num-> num*2);
        // s.reduce(0,(a,c)-> a+c); since we can operate on stream just once we gonna use an alternate version of this which is very handy
        int result = s
                    .filter(num-> num%2==0)
                    .map(num-> num*2)
                    .reduce( 0,(a,c)-> a+c); 
                    // 0 = initial value, a = accumulator and c = current value logic form python

        System.out.println(result);
    }
}