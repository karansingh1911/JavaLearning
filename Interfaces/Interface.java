interface Car{  // we cannot instantiate directly 

    int WHEEL_COUNT=4; //All fields in an interface are public static final 

    void drive(); // // implicitly public and abstract 
    void playMusic();
}

class WagonR implements Car{
    @Override
    public void drive(){
        System.out.println("Driving ...");
    }

    @Override 
    public void playMusic(){
        System.out.println("Playing music ...");
    }
}
public class Interface{
    public static void main(String[] args) {

        Car c; // c=new Car(); => wrong=> interfaces cannot be instantiated!
        c=new WagonR();
        c.drive();
        c.playMusic();
    }
}