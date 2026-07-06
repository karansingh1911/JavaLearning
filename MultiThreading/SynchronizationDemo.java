// The main issues with synchronization is : no fairness, its blocking in nature, interruptibility, unable to distinguish b/w read/write locking 
public class SynchronizationDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter); // here the counter is shared by both the threads t1,t2

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(counter.getCount());

    }
}

class MyThread extends Thread {
    Counter counter = new Counter();

    public MyThread(Counter counter) { // constructor
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

class Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    // public synchronized void increment() { // here collision can happen for t1
    // and t2 since a single Counter objects is shared (use sybchronized)
    // count++;
    // }
    // better approach- synchronize over method, better readability, less code,
    // easier to maintain
    public void increment() {
        synchronized (this) { // this : when single resource is shared by many threads, let one thread do this
                              // at once
            count++;
        }
    }
}
// Critical section: A section where a single resource can be accessed by many
// threads

// MUTEX PRINCIPLE: At most one thread can execute a critical section (shared
// resource code) at a time. -> use synchronized to make sure it happens
