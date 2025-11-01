// its not necessary just to override a single method we create child class; rather what we can do is implement the parent class and instantiate using constructor and implement it another way this helps too!
class Car{ 
    void driveCar(){
        System.out.println("Driving the car...");
    }
}
// class Bmw extends Car{
//     void driveCar(){
//         System.out.println("Driving the BMW car");
//     }
// }

public class AnonymousInnerClass{
    public static void main(String[] args){
        Car c= new Car(){
            @Override
            void driveCar(){
                System.err.println("driving the car using anonymous inner class...");
                // this by default create an inner class and will create a file class$1 in the folder
            }
        };
        
    c.driveCar();
    }
    
}