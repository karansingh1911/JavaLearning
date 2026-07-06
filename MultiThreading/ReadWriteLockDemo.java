
// Allows many threads to read shared resource at once until write in progress by any thread

// When is ReadWriteLock beneficial?
//      ✅ Read operations are frequent.
//      ✅ Reads don't modify shared state.
//      ✅ Writes are relatively rare.

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

public class ReadWriteLockDemo {

    private static final Logger logger = Logger.getLogger(ReadWriteLockDemo.class.getName());

    public static void main(String[] args) {

        SharedResourceClass sharedResource = new SharedResourceClass();
        Runnable readerThread = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sharedResource.getCounter();
                }
            }
        };
        Runnable writerThread = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sharedResource.incrementCounter();
                    sharedResource.getCounter();
                }
            }
        };

        Thread writerThread1 = new Thread(writerThread);
        Thread writerThread2 = new Thread(writerThread);
        Thread readerThread1 = new Thread(readerThread);
        writerThread1.start();
        writerThread2.start();
        readerThread1.start();

        try {
            readerThread1.join();
            writerThread1.join();
            writerThread2.join();
        } catch (InterruptedException e) {
            logger.warning("Error occurred...");

        }

    }
}

class SharedResourceClass {
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    private int counter;

    public int getCounter() {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " getting value of counter : " + this.counter);
            return this.counter;
        } finally {
            readLock.unlock();
        }
    }

    public void incrementCounter() {
        writeLock.lock();
        try {
            this.counter++;
            System.out.println(Thread.currentThread().getName() + " incremented counter value to: " + counter);
        } finally {
            writeLock.unlock();
        }
    }

}
// Properties of ReentrantReadWriteLock
// 1. Allows multiple readers simultaneously.
// 2. Allows only one writer at a time.
// 3. Writer gets exclusive access to the shared resource.
// 4. Readers are blocked while a writer holds the write lock.
// 5. Writers wait until all active readers release the read lock.
// 6. Readers never block other readers.
// 7. Writers block both readers and other writers.
// 8. Reentrant (same thread can reacquire the same lock).
// 9. Supports lock downgrading (Write -> Read).
// 10. Does not support lock upgrading (Read -> Write) directly.
// 11. Supports Fair and Non-Fair modes.
// 12. Lock protection exists only between lock() and unlock().
// 13. Best suited for read-heavy workloads.
// 14. Improves throughput compared to ReentrantLock when reads greatly
// outnumber writes.
