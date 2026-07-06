
//NOTE: Daemon thread is a background service thread that supports user threads. The JVM does not wait for daemon threads to finish before shutting down. User threads perform the actual application work and keep the JVM alive. We make a thread daemon when it performs non-critical tasks such as cache cleanup, monitoring, or housekeeping, so it does not prevent application shutdown.
public class DaemonThreadDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread(); // this is by default "userThread"
        t.setDaemon(true); // "daemonThread" - a thread running in bg that exists only to support other threads(GC, JIT compiler threads or monitoring/housekeeping related )
        t.start(); 
        
    }
}

class MyThread extends Thread {
    @Override 
    public void run() {
        for (int i = 0; i < 10; i++) {
                System.out.println("Running thread" + Thread.currentThread().getName());
        }
    }
}