import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class CallableDemo {
    private static final Logger logger = Logger.getLogger(CallableDemo.class.getName());

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> futureVal = executor.submit(() -> { // for submitting list of = callables to the executorService use invokeAll() -> returns List<Future<T>>
            Thread.sleep(10000);
            return 100;
        });
        try { // main method tries to get the value of futureVal, main gets blocked!
            logger.info("The value of futureval at present is: " + futureVal.get()); ///get() is blocking in nature
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            logger.warning("Error occurred while getting value of futureVal: " + e);
        } finally {
            executor.shutdown(); // let worker threads working in background finish then shutdown the pool,
            //executor.shutdownNow(); // Instantly close the theadpool, terminate all the threads, however no guarantee
        }
    }
}

// Drawbacks of Future api: blocking in nature, cannot connect/chain computations until result arrive!
