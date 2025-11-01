// Abstract class => is a relationship (Animal=eat,sleep => Dog)

// Interfaces => can do relationship ( class Duck extends Animal implements Swimmable, Flyable { ... })

// class can inerit interfaces via implements for behavioral contracts !!!


interface  Computer {
     void coding();
}
// class Computer {  ==> can be converted to abstract class 
//     public void coding(){
//         //....
//     }
// }
class Laptop implements  Computer{   
    @Override
    public void coding(){
        System.out.println("CODING....."); // for development we need coding!!
    }
}
class Desktop implements Computer{
    @Override
    public void coding(){
        System.out.println("CODING FASTER AND SMOOTHER.....");
    }
}

class BackendDeveloper{
    public void AppDevelopment(Computer lap){  // a developer can be assigned laptop as well as a desktop not sure right??
        lap.coding();
    }
}

public class NeedforInterfaces{
    public static void main(String[] args){
        BackendDeveloper dev=new BackendDeveloper();
        // Computer lap=new Laptop(); // interface reference
        Computer desk=new Desktop(); // interface reference
        dev.AppDevelopment(desk); // now lap can be passed too if needed!


        
    }

}
