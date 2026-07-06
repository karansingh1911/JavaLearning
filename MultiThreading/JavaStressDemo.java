
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaStressDemo {

    private static final List<String> names = new ArrayList<>();
    private static final AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) throws Exception {

        for (int i = 1; i <= 100; i++) {
            names.add("User-" + i);
        }

        System.out.println("Total Names = " + names.size());

        List<String> filtered = new ArrayList<>();

        for (String name : names) {
            if (name.endsWith("5")) {
                filtered.add(name);
            }
        }

        Collections.sort(filtered);

        for (String s : filtered) {
            System.out.println(s);
        }

        Map<String, Integer> map = new HashMap<>();

        for (String s : names) {
            map.put(s, s.length());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.incrementAndGet();
                }
            }
        };

        for (int i = 0; i < 4; i++) {
            executor.submit(task);
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);

        System.out.println("Counter = " + counter.get());
    }
}