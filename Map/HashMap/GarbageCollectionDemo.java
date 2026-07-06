
import java.lang.ref.WeakReference;

//An object is eligible for Garbage Collection when it can no longer be reached from any GC Root, regardless of whether the object still physically exists in heap memory.
class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }

}

public class GarbageCollectionDemo {

    public static void main(String[] args) {
        Employee e = new Employee("Karan"); // strong reference: objects are stored inside the heap
        System.out.println(e);
        e = null; //  now object e with value "Karan" is eligible for GC

        WeakReference<Employee> rahul = new WeakReference<>(new Employee("Rahul")); // Weak reference
        System.out.println(rahul.get());
        System.gc(); // suggesting JVM to collect the objects made of weak reference.
        try {
            Thread.sleep(10000);
        } catch (Exception ignored) {

        }
        System.out.println(rahul.get());

    }

}

// Whenever JVM decides memory cleanup, the eligible candidates gets deleted :
//1. Heap memory is getting full.
//2. Young Generation fills up.
//3. JVM decides it's a good time to run GC.
//4. You create lots of new objects.
// Q: What happens after an object becomes eligible for Garbage Collection?
// Answer: The object remains in heap memory until a GC cycle runs. During GC, unreachable objects are identified and their memory is reclaimed so it can be reused for future object allocations. There is no guarantee when exactly the JVM will collect the object.
