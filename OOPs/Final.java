// // FINAL : 
// for Class - to stop inheritance
// for method - to stop method overriding 
// for variables -  to stop change in value

 class Calc{ // Note: here if i declare final class Calc this wont allow any class to extend to Calc
    public int add(int a ,int b){
        return a+b;
    }
    final void show(){ // I don't want this method to change in future
        System.out.println("This function must not be changed or overrided");
    }
}
class AdvCalc extends Calc {
    public int add(int a ,int b){ // i want add works as it works in parent class 
        return (a+b+1);
    }
    //  void show(){  
    //     System.out.println("The parent method has been overrided !");
    // }
    //     show() in AdvCalc cannot override show() in Calc
    //   overridden method is final
    
}
public class Final{
    public static void main(String[] args){
        AdvCalc a=new AdvCalc();
        a.add(1,3);
        a.show();
    }
}