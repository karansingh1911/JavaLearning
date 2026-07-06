public class ThreadCommunication {

    public static void main(String[] args) {

        SharedResource account = new SharedResource(0);

        Thread consumer = new Thread(() -> {
            account.spend(500);
            System.out.println(Thread.currentThread().getName() + " spent ₹500");
        }, "Consumer");

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(3000); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            account.earn(1000);
            System.out.println(Thread.currentThread().getName() + " deposited ₹1000");
        }, "Producer");

        consumer.start();
        producer.start();
    }
}

class SharedResource {

    private int balance;

    public SharedResource(int balance) {
        this.balance = balance;
    }

    public synchronized void spend(int amount) {

        while (balance < amount) {
            System.out.println(Thread.currentThread().getName()
                    + " : Waiting for sufficient balance...");

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }

        balance -= amount;

        System.out.println(Thread.currentThread().getName()
                + " : Withdrawn ₹" + amount
                + " | Balance = ₹" + balance);
    }

    public synchronized void earn(int amount) {

        balance += amount;

        System.out.println(Thread.currentThread().getName()
                + " : Deposited ₹" + amount
                + " | Balance = ₹" + balance);

        notify(); // Wake one waiting spender
    }
}
