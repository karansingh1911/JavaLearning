class CustomException extends Exception{
    public CustomException(String msg){
        super(msg);
    }


}
public class CustomExceptionDemo{
    public static void main(String[] args) {
        int i=10;
        int j=0;
        int result;
        try {
            
            if(j==0){
                throw new CustomException("This is my created arguement for throw when issue occurs"); 
                //“I’m not waiting for Java’s default exceptions — I’m throwing my own kind of problem.”
            }
            result= i/j;
        } catch (CustomException a) {
            result =i;
            System.out.println("In catch the issue has been handled!");

            System.out.println(a.getMessage());
            System.out.println(a);
        }

        System.out.println(result);
    }
}