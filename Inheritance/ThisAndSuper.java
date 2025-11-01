class Parent{
   public  Parent(){
    System.out.println("In parent default constructor.");
   }
   public  Parent(int n){
    System.out.println("This is the parameterized constructor getting called");
   }

}

class Child extends Parent{
    public Child(){ // child constructor calls parent constructor default version the child cons.
        System.out.println("In Child's default constructor.");
    }
    public Child(int n){ // child constructor calls parent constructor default version the child cons.
    this();
    // super(n); If both this(...) (another constructor in the same class) and super(...) (a parent constructor) could be called, there would be two competing initialization chains, which could create ambiguity. -- java doesn't allow this 
        System.out.println("In Child's Parameterized constructor.");
    }
    

}

class ThisAndSuper{
    public static void main(String[] args){
        Child c= new Child(5);
        
    }
}