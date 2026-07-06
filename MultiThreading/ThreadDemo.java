public class ThreadDemo {
    public static void main(String[] args) {
        // this is the main thread - only thread on which run method executes
        System.out.println(Thread.currentThread().getName());


        // creating using Thread class 

        World world = new World();
        world.start();

        // creating using Runnable Interface 
        Thread t = new Thread(new WorldX());
        t.start();

        

        

    }
     
}

class World extends Thread {
    // firstly any class which extends Thread needs to override run();
    @Override
    public void run() { // whatever we want to do inside this thread
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }

    }

}
// firstly any class should implement Runnable, then the object of that class needs to be passed to the Runnable 
class WorldX implements Runnable {
    
        @Override
        public void run() { // whatever we want to do inside this thread
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
            
        }
        
    }
