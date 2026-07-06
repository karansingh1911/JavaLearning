
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// There are 2 types of locks: Intrinsic(synchronized), Explicit lock(using Lock class: java.util.concurrent.locks)
public class LocksDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Runnable takeMoney = new Runnable() {
            @Override
            public void run() {
                bankAccount.withdraw(10);
            }
        };
        Thread t1 = new Thread(takeMoney, "Thread-1");
        Thread t2 = new Thread(takeMoney, "Thread-2");

        t1.start();
        t2.start();

    }
}

class BankAccount {
    private int balance = 100;

    // public synchronized void withdraw(int amount) { // since synchronized is slow
    // here we will use manual locks
    // System.out.println(Thread.currentThread().getName()+ "Attempting txn ");
    // if (balance > amount) {
    // System.out.println("Txn is happenning for amount: " + amount);
    // }
    // try { // imagine this stimulation as other business flow

    // Thread.sleep(3000);
    // } catch (InterruptedException e) {
    // System.out.println(e);
    // }
    // balance = balance - amount;
    // System.out.println("Completed withdrawl"+" remaining balance is: " +
    // this.balance);
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal");
                        Thread.sleep(3000); // Simulate time taken to process the withdrawal
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()
                                + " completed withdrawal. Remaining balance: " + balance);
                    } catch (Exception e) {
                    } finally {
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock, will try later");
            }
        } catch (Exception e) {

        }
    }
}