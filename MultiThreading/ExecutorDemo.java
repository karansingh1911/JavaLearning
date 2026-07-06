
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class ExecutorDemo {
    private static final Logger logger = Logger.getLogger(ExecutorDemo.class.getName());

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2); // creating thread pool with the help of
        try {
            for (int i = 0; i < 5; i++) {
                final int taskId = i;
                executorService.execute(() -> // defining the unit of work, not executing here
                // use executorService.submit() when there is a need to produce a value, takes Callable<T> object, this returns Future<T>
                logger.info("Task id:" + taskId + " is getting performed by:" + Thread.currentThread().getName()));
            }
        } finally {
            executorService.shutdown();
        }
    }

}

// Thread Pool: Collection of pre- initialised set of threads pre-defined for certain task concurrently, when a thread is done with the task it doesn't terminate rather becomes available again for the next task.
// Benefits: Resource management, Response time, contorl over thread count

// Important concept:
// A lambda cannot directly access local variables after the enclosing method returns because those variables live on the stack and are destroyed.
// Therefore, when a lambda is created, Java copies (captures) the current value of every referenced local variable into the lambda object itself.
// To ensure that both the enclosing method and the lambda always observe the same value and to avoid ambiguous semantics, Java only allows capturing local variables that are final or effectively final.
// Once captured, the lambda always uses its own stored copy, regardless of when it executes.

// When there is no need to capture:
//  1.A local variable needs to be final (or effectively final) only when it is captured by a lambda or an anonymous inner class.
//  2.If the value is passed directly to a method that executes immediately, no capture occurs, so no final requirement exists.
