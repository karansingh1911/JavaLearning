import java.util.logging.Logger;

public class VirtualThreadDemo {
    private static final Logger logger = Logger.getLogger(VirtualThreadDemo.class.getName());

    public static void main(String[] args) {
        Thread t = Thread.startVirtualThread(() -> { // To create virtual thread and start use startVirtualThread(Runnable) instead of run(Runnable)
            logger.info("Hello from virtual thread.");
        });

        try {
            t.join(); // i
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.severe("Thread join interrupted: " + e.getMessage());
        }
    }
}
