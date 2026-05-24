
import java.util.LinkedList;
import java.util.Stack;

// Stack extends vectors, but works on LIFO principle 
public class StackDemo {

    public static void main(String[] args) {
        Stack<String> names = new Stack<>(); // also contains methods from vector, but every method is synchronized 
        names.push("Karan");
        names.push("Ram");
        names.push("Shyam");
        names.push("Ankit");
        System.out.println(names);
        names.pop();
        System.out.println(names);
        String name = names.peek(); // use peek to see the element at top
        System.out.println(name);
        Integer searchedName = names.search("Ram"); // 1-based index, returns Integer
        System.out.println(searchedName);

        // Using linkedList as stack
        LinkedList<Integer> numbers = new LinkedList<>(); // doubly linked-list
        numbers.addLast(1); // addLast ->push
        numbers.addLast(2);
        numbers.addLast(3);
        numbers.addLast(4);
        numbers.removeLast(); // removeLast -> pop

    }
}
// Use-case: when the order preferred is LIFO,synchronized
