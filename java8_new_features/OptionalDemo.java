
import java.util.Optional;

// Usecase :Optional is used to represent a value that may or may not be present, helping avoid NullPointerException.
// rather than handling nullPointer exception, doing error handling and if-else, using optional makes sense at runtime 
public class OptionalDemo {

    public static void main(String[] args) {
        // provides isPresent -> predicate : returns true if the value is present and not null!
        String s1 = "karan";
        String s2 = s1;
        System.out.println(s2);

        String s3 = null;
        // String s4 = s3.toLowerCase(); // this gives NullPointerException 
        String s4 = Optional.ofNullable(s3).orElseThrow(() -> new RuntimeException("Anything"));
        System.out.println(s4);

    }
}
