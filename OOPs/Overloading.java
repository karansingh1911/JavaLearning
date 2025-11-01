
// Method overloading is when two or more methods in the same class have the same name but different parameter lists (different number, type, or order of parameters).

// Same method name
// Different parameter list
// Return type alone doesn’t differentiate methods
// Resolved at compile time

class OverloadingMethodClass {    
    int addition(int a,int b){  
        return a+b;
    }
    String addition(String a,String b){ //type differs here 
        return (a+" "+b);
    }
    int addition(int a,int b,int c){  // parameters differ here 
        return a+b+c;
    }

}

public class Overloading{
    public static void main(String[] args){
        int a=10,b=20,e=100;
        String c="hi",d="bye";
        OverloadingMethodClass o1=new OverloadingMethodClass(); // no any calls will complain and will work and self-define what function to pick!
        System.out.println(o1.addition(a,b));
        System.out.println(o1.addition(a,b,e));
        System.out.println(o1.addition(c,d));


    } 

}