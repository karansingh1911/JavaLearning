class Clac{

    int add(int a, int b){
        return a+b;
    }
}
class AdvCalc{
    int add (int a, int b){ // same name, same arguement but different behaviour or working.
        System.out.println(a+b+1);
        return a+b+1;
    }
}
public class Overriding{
    public static void main(String[] args){
        AdvCalc c1= new AdvCalc();
        c1.add(1, 6); 
    }
}