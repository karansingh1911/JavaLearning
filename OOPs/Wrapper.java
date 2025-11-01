public class Wrapper{
    public static void main(String[] args){
        int num1=7;
        Integer num2=num1; // auto-boxing
        System.out.println(num2); 
        int num3= num2;
        System.out.println(num3);   // auto-unboxing 
        String s= "12";
        int parsedInt= Integer.parseInt(s); // parsing string 
        System.out.println(parsedInt);
        }
}