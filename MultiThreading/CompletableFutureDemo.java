import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

public class CompletableFutureDemo {

    public static final Logger logger = Logger.getLogger(CompletableFutureDemo.class.getName());

    public static long doHeavyComputation(int x) {
        long result = 0;
        for (long i = 0; i < 500_000_000L; i++) {
            result += (i * x) % 7;
        }
        return result;
    }

    public static void main(String[] args) {
        // supplyAsync(Callable),runAsync(Runnable), Uses ForkJoinPool.commonPool() internally if not provided
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> { // returns CompletableFuture<Integer>
                    logger.info("Supply : " + Thread.currentThread().getName());
                    return 1000;
                }, executor)
                .thenApplyAsync(value -> { // returns CompletableFuture<Integer>
                    logger.info("Apply : " + Thread.currentThread().getName());
                    return doHeavyComputation(value);
                })
                .thenAccept(value -> { // returns CompletableFuture<Void>
                    logger.info("Accept : " + Thread.currentThread().getName());
                    System.out.println("Result = " + value);
                });

        future.join();
        executor.shutdown();
    }
}
//CompletableFuture: A promise that sometime in the future, there will be either a value of type T, an exception, or a cancellation.  Uses ForkJoinPool.commonPool() internally
// ForkJoinPool- has Submission queue, ThreadPool and a Work Stealing Queue(this alone allows sub-task stealing by another thread in the forkJoinPool and using join() at the end for final result)
//[ Recursive task(returns value) and recursiveAction(no return value) ]+ forkJoinPool is a better design decision. (mainly recursive or divide and conquer problems/tasks are suitable)
