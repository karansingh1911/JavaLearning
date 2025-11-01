// Encapsulation : bundling class and methods in a function while restricting access to data without access modifiers

class Human{
    private String name; // not accessible outside class DIRECTLY!
    private int age;
    public Human(){ // constructor : name must match with class name and doesn't return anything
        name="";         // default constructor 
        age = 20;
    }
    

    public Human(int age, String name) { // parameterized constructor 
        this.age = age;
        this.name = name;
    }

    // public int GetAge(){
    //     return age;
    // }
    // public String GetName(){
    //     return name;

    // }
    // public void Setage(int a){
    //     age=a;
    // }
    // public void Setname(String s){
    //     name=s;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name; 
        // here this represents the current object whoever calls the getter or the setter 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
public class ConstructorOverloading{
    public static void main(String[] args) {
        Human h1=new Human();
        // System.out.println(h1.age);
        // System.out.println(h1.name);
        // this wont work now you gotta access it indirectly using class methods which are public ! 


        System.out.println(h1.getAge());
        System.out.println(h1.getName());
        
    }
}