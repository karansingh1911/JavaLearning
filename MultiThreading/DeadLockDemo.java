class SharedResource {

    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void A() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " locked lock1");

            sleep();

            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + " locked lock2");
            }
        }
    }

    public void B() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " locked lock2");

            sleep();

            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + " locked lock1");
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class DeadLockDemo {

    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(resource::A, "Thread-1");
        Thread t2 = new Thread(resource::B, "Thread-2");

        t1.start();
        t2.start();
    }
}
// 4 conditions for Deadlock
// 1.Mutual Exclusion: Only one thread can access a resource at a time
// 2.Hold and wait: a thread holding at least one resource in waiting to aquire
// additional resource held by other threads
// 3.No Preeption: resources cannot be forciblt taken from threads holding them
// 4. Circular wait: A set of threads is waiting for each other in a circular
// chain
