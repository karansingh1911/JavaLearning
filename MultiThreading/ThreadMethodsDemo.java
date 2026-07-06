public class ThreadMethodsDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setPriority(Thread.NORM_PRIORITY); // setting priority bw 1(min) to 10(mx)
        t1.setPriority(Thread.MAX_PRIORITY); // setting priority bw 1(min) to 10(mx)
        t1.start();
        t2.start();
        t2.interrupt(); // whatever work done by thread is done now just stop!
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
           System.out.println(e);
        }
        System.out.println("The main Thread is finished working here...");
        
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread is running..."+ Thread.currentThread().getName());
            Thread.yield(); // inside run :hint the scheduler to yield its own use to the processor, if it wants to work with another thread 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
      }
}