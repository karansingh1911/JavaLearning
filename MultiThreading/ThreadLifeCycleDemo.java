//There are 5 stages of Threads lifecycle
//1.New- Created but not started -> Thread t = new Thread( new World()); -> no .start is called
//2.Runnable- after .start() method is called the thread is runnable and waiting forCPU time -> thread1.start();
//3.RUnning- thread is run by the processor -> while thread is doing actual work 
//4.Blocked/Waiting- A thread is in waiting for another thread/resource to perform an action -> when we pause the thread for sometime it goes into the state TIME_WAITING
//5.Terminated- When finished executing the thread 


public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        // this is the main thread - only thread on which run method executes
        System.out.println(Thread.currentThread().getName());
       
        // creating using Thread class 
        Program program = new Program();
         System.out.println(program.getState());
         program.start();
         System.out.println(program.getState());
         try {
            program.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
         System.out.println("main: "+Thread.currentThread().getState());
         
    }
     
}

class Program extends Thread {
    // firstly any class which extends Thread needs to override run();
    @Override
    public void run() { // whatever we want to do inside this thread
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getState());
            
        }
    }

}
