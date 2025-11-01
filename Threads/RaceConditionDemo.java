// Note:  if you want to implement mutation, try to make the code thread safe and for immutable kind of operation threads are good.

// Ex: A bank account has 10000 rs but 2 different debit card, now what will happen if both cards are swiped at the same time to withdraw 8000 simultaneously? -> Will cause instability!!!
class Counter{
    private int count =0;
    public synchronized void increase(){ // to prevent the line 49 issue we use the keyword synchronized 
        count++;
            }

    public int getCount() {
        return count;
    }
}
public class RaceConditionDemo{
    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable obj1 = () ->{
            for (int i = 0; i < 1000; i++) {
                c.increase();
            }
                
        };
        Runnable obj2 = () ->{
            for (int i = 0; i < 1000; i++) {
                c.increase();
            }
                
        };

    Thread t1= new Thread(obj1);
    Thread t2= new Thread(obj2);

    t1.start();
    t2.start();

        try {
            // ✅ Wait for both threads to complete
            t1.join();
        } catch (InterruptedException ex) {
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
        }
    System.out.println(c.getCount());  //sometimes it will give less than 2000 

    }
}