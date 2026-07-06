import java.util.logging.Logger;

public class ThreadLocalDemo {
    private static final Logger logger = Logger.getLogger(ThreadLocalDemo.class.getName());
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        Runnable task = () -> {
            try {
                threadLocal.set(Thread.currentThread().getName());
            } finally {
                threadLocal.remove();
            }

            logger.info(Thread.currentThread().getName() + " -> " + threadLocal.get());
        };

        new Thread(task, "Thread-A").start();
        new Thread(task, "Thread-B").start();

    }

}
