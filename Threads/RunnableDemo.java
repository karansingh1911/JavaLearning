class A implements Runnable{ 
    // runnable is a functional interface by definition!
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi there!");
        }
    }
}
class B implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Bye there!");
        }
    }
}
public class RunnableDemo{
    public static void main(String[] args) {
        // dynamic method dispatch done so that obj1 and obj2 reference can be passed!
        Runnable obj1= new A(); 
        Runnable obj2= new B();
        
        Thread t1=new Thread(obj1);  // now the thread knows about the runnable!
        Thread t2=new Thread(obj2);
        t1.start();  // now this start knows which run method to run. 
        t2.start(); 
    }
}

//  Note : if the method in the class has to be used only once or the class itself once then here lambda expression can be written using anonymous inner class => then the class definition will not be required !!!