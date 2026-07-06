import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ThreadPoolExecutorDemo {
    private static final Logger logger = Logger.getLogger(ThreadPoolExecutorDemo.class.getName());

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));
        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executor.execute(
                    () -> {
                        logger.info("Task:" + taskId + "getting performed by: " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            logger.warning("Current thread got interrupted" + e);
                        }
                    });

        }
        executor.shutdown();

    }

}
// ThreadpoolExecutor is a configurable engine has worker threads and has queue for storing tasks and set of rules
// Executors.newFixedThreadPool -> new ThreadPoolExecutor()
// new ThreadPoolExecutor(int CurrentPoolSize, int maxPoolSize, long KeepAliveTime, Timeunit unit, BlockingQueue <Runnable> workQueue- fiexed/unlimited)
// Types of queue that can be passed - ArrayBlockingQueue( fixed by definition), LinkedBlockingQueue(keep adding queue, uses linkedList in background)
// Types of ThreadPools:
//  1. newFixedThreadPool- (uses ThreadPoolExecutor that only asks for core Thread count + uses unbounded queue): causes memory issues
//  2. new CacheThreadPool()-  uses unlimited Threads, no queue:( can crash when heavy load)
//  3. new SingleThreadPool()-  1 thread + queue : serialization of taks - use-case in logging
//  4. new ScheduledThreadPool()- Run task in Future has method .schedule(Runnable,Time,TimeUnit)

//Types of Rejection policies: 1. Abort(throw RejectedException)    2. Discard(silently discard; dangerous)    3.DiscardOldeset(Used in real-production)
