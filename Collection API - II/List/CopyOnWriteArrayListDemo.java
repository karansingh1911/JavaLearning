
// ArrayList and LinkedList are not thread-safe.Concurrent modification from multiple threads can lead to inconsistent behavior.
// Stack and Vector are synchronized but less performant (less performant)
// we needed a data structure which can deliver good performance and can handle concurrency -> CopyOnWriteArrayListDemo
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> data
                = new CopyOnWriteArrayList<>();

        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);

        System.out.println("Initial List: " + data);

        // Reader thread
        Thread reader = new Thread(() -> {

            System.out.println("Reader started...");

            for (Integer i : data) {

                System.out.println("Reading: " + i);

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Reader done...");
        });

        // Writer thread
        Thread writer = new Thread(() -> {

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("\nWriter adding 100");
            data.add(100);

            System.out.println("Updated List: " + data);
        });

        reader.start();
        writer.start();
    }
}

//  Use-case : Read extensive and write less 
//  "Copy on write" means whenever the write operation like adding/removing, instead of directly modifying the list, new copy of existing list is created and modification is applied on that new list, Other threads can read original thread till then, unaffected and while modification

// Trade off -> Read operations are fast because readers access an immutable snapshot without locking, writes(slow since new memory is needed where it can be copied each time )
