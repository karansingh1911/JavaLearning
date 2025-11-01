// Notes: 
//1. We cannot create an object of abstract class... 
//2. Any abstract method of parent class must be overrided in the inherited class... 
//3. If there is any abstract method in the class the class must also be defined as an abstract class....

abstract class Car{ 
    public void playMusic(){
        System.err.println("Playing music....");
    }
    public abstract void drivingMode();
    //  void drivingMode(){
    // since we have the idea that diff cars will have diff modes we will make this idea an abstract so that real-world object can inherit and override 
    //      don't know yet what this function will do 
    //  }
}
class Swift extends Car{ // this is an example for concrete class.

    @Override
    public void drivingMode(){
        System.out.println("The swift has just 2 modes - manual and automatic.");
    }
}


public class AbstractKeyword{
    public static void main(String[] args){
        // Car c1= new Car(); abstract class cannot be instantiated.
        Swift swift=new Swift();
        swift.drivingMode();
        swift.playMusic();
    }
}