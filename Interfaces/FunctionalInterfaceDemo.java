
@FunctionalInterface
interface Car{
    void gearMode();
}
public class FunctionalInterfaceDemo{
    public static void main(String[] args) {
        Car c= new Car(){  
            //This anonymous inner class creation can be turned into a lambda expression.
            @Override
            public void gearMode(){
                System.out.println("This is an implementation for a Manual geared car...");
            }
        };
        c.gearMode();
    }
}