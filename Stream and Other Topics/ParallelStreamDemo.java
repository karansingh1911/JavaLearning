import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class ParallelStreamDemo{
    public static void main(String[] args) {
        int size=10_000;
        List<Integer> nums =  new ArrayList<>(size);
        Random r= new Random();
        for(int i=0;i<size;i++){
          nums.add(r.nextInt());
        }
        
        int result1= nums.stream()
                    .map(num-> num*2)
                    .reduce(0,(a,c)->  a+c);
        
        // System.out.println(nums);    
        long startSqStream = System.currentTimeMillis();  
        int result2= nums.stream()
                    .map(num-> num*2)
                    .mapToInt(value-> value)
                    .sum(); // since sum needs Integer hence we will convert the stream to integer so that the sum method can be called
        long endSeqStream = System.currentTimeMillis();

        long startParallelStream = System.currentTimeMillis();
        int result3= nums.parallelStream()
                    .map(num-> num*2)
                    .mapToInt(value-> value)
                    .sum();
        long endParallelStream = System.currentTimeMillis();

        System.out.println("result2 is :"+ result2+" and result1 is :"+result1 + "result3 is " +  result3);
        System.out.println("SquentialStream timings: " + (endSeqStream-startSqStream)+ " ParallelStream timings: " + (endParallelStream-startParallelStream));

        
    }
}