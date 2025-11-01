@FunctionalInterface
interface Calculator{
    int add(int a, int b);
    }

public class LambdaReturnDemo{
    public static void main(String[] args) {
        Calculator calc = (i,j) -> i+j; 
        // or we can use Calculator calc =(int i,int j)  -> return (i+j);
        int result = calc.add(5,6);
        System.out.println(result);
    }
    
}