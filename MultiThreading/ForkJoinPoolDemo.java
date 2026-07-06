import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Logger;

public class ForkJoinPoolDemo {
    private static final Logger logger = Logger.getLogger(ForkJoinPoolDemo.class.getName());

    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 2, 3, 4, 5 };
        ForkJoinPool pool = new ForkJoinPool();
        SumTask t = new SumTask(arr, 0, arr.length - 1);
        int result = pool.invoke(t);
        logger.info("Value computed for the given array: " + arr + "is: " + result);
        pool.shutdown();
    }

}

// Creating a class that does certain unit of work - adds an array elements whichever array it stores and extends RecursiveTask<T>

class SumTask extends RecursiveTask<Integer> {

    private int[] arr;
    private int start;
    private int end;

    public SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {

        // base condition
        if (end - start <= 2) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += arr[i];
            }
            return sum;
        }
        //main logic
        int mid = (start + end) / 2; // having a pointer to mid will help to divide our task
        SumTask leftTask = new SumTask(arr, start, mid);
        SumTask rightTask = new SumTask(arr, mid + 1, end);

        leftTask.fork(); // keep this work in work stealing queue and do right task
        int rightSum = rightTask.compute();

        int leftSum = leftTask.join(); // when forked task is executed by a thread and computation is done store here !

        return leftSum + rightSum;

    }

}
