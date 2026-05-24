
import java.util.function.Consumer;

// Method reference(::) : allows to refer to a method without invoking it. Can be used instead of lambda expression, when lambda itself only calls existing method. 
//  Similarly constructor reference allows x->  new Student(x);
// =Student::new 
public class ReferenceDemo {

    public void greet(String user) {
        System.out.println("Hello " + user);
    }

    public static void main(String[] args) {

        ReferenceDemo obj = new ReferenceDemo();

        Consumer<String> consumer = obj::greet;

        consumer.accept("Karan");
    }
}
