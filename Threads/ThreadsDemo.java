// In every thread there has to be run method 
// it's the scheduler that does the work - time sharing for the thread operations
class A extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("A class run executed");
        }
    }

}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 50; i++) {
            System.out.println("B class run executed");
        }
    }

}
public class ThreadsDemo{
    public static void main(String[] args) {
        A obj1= new A();
        B obj2= new B();
        obj1.start();
        obj2.start();
    }
}