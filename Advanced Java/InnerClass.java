class Outer{
    private int id;

    void showOuterClass(){ //  this is a non-static method : cannot be called without object creation
        System.out.println("This is the outer class...");
    }

    class Inner{
        void configure(){
            System.out.println("Configuring the outer class using inner class...");
        }
    }
    static class Inner1{
        void configure1(){
            System.out.println("Configuring the outer class using inner class 1...");
        }
    }

}
public class InnerClass{
    public static void main(String[] args){
        // to create an object of inner class we must instantiate outer class
        Outer outer= new Outer();
        outer.showOuterClass();

        Outer.Inner inner= outer.new Inner(); // how to instantiate inner class object and how to call it 
        inner.configure();

        Outer.Inner1 inner1= new Outer.Inner1(); // if its a static class it can be instantiated directly using Outer.Inner inner= new Outer.Inner();
        inner1.configure1();
    }

}