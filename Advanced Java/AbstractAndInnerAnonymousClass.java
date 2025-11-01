   // to use drive() we need to  instantiate the object of child class of the Car, rather what we can do is create a inner anonymous class so that we can use it once for the sake and it will not require to type this much!!
    abstract class Car{ 
    
        public abstract void drive();
    }

    public class AbstractAndInnerAnonymousClass{
        public static void main(String[] args){
            Car c=new Car(){
                @Override
                public void drive(){
    //Note: Here on doing so in the main method it automatically creates a inner class which is anonymous hence it's abstract and inner anonymous class !!!                
                    System.out.println("New version of the Car is working without instantiating the child class of parent abstract class");
                }
            };
            c.drive();

        }


    }