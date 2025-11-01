// Enum doesn't support Inheritance

enum Status{ 
    Running, Pending, Failed, Successful;
}
public class SwitchStatus{
    public static void main(String[] args){
        
        Status s= Status.Failed;
        
        switch (s) {
            case Running -> System.out.println("Running...");
            case Successful -> System.out.println("Successful...");
            case Failed -> System.out.println("Failed...");
            case Pending -> System.out.println("Pending...");
            default -> System.out.println("Successful...");
        }

    }
}