// Priority Scale : 1(lowest) -> 10(highest)

class A extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("A class run executed");
            
        }
        try {
                Thread.sleep(100); // execution goes into waiting stage.
            } catch (InterruptedException ex) {
                
            }
    }

}
class B extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("B class run executed");
        }
        try {
                Thread.sleep(100); // execution goes into waiting stage.
            } catch (InterruptedException ex) {
            }
    }

}

public class PriorityAndSleepDemo{
    public static void main(String[] args) {
        A obj1= new A();
        B obj2= new B();
        obj1.setPriority(Thread.MAX_PRIORITY-5);
        obj1.setPriority(Thread.MAX_PRIORITY-6);
        obj1.start();
        obj2.start();
        
    }
}