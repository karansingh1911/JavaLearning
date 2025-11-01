 // now no need for using annotation here
 // Note: this annotation will not create any new inner abstract class on compilation! 
 @FunctionalInterface
interface Car{
    void gearMode();
}
public class LambdaDemo{
    public static void main(String[] args) {
        Car c= () ->{
            System.out.println("This is an implementation for manual geared car"); // Syntactical sugaring!!! => fancy terminology
        };
        c.gearMode();
    }
}