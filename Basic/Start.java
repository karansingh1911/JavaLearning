class Calculator{     // new class
    int result;
    public int addition(int num1,int num2){    // method
        result=num1+num2;
        System.out.println(result);
        return result;  
    }
}


public class Start{
    public static void main(String[] args){
        int a=5;
        int b=6;
        int result;
        Calculator c1= new Calculator();   // creating object
        result=c1.addition(a, b);              // calling method

    }
}