public class Main{
    public static void main(String[] args) {
        int n1=5;
        int n2=2;
        AdvancedCalculator c1=new AdvancedCalculator();  // single-level 
        System.out.println(c1.addition(n1, n2));
        System.out.println(c1.subtraction(n1, n2));
        System.out.println(c1.division(n1, n2)); // it will not run until the calc extends advanced calc

        VeryAdvancedCalculator c2=new VeryAdvancedCalculator(); // multi- level 
        System.out.println();
        System.out.println(c2.addition(n1, n2));
        System.out.println(c2.subtraction(n1, n2));
        System.out.println(c2.division(n1, n2));
        System.out.println(c2.multiplication(n1, n2));
        System.out.println(c2.power(n1, n2)); // veryAdvancedCalculator extends AdvancedCalculator
    }
}