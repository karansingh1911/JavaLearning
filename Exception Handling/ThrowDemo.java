


class ThrowDemo{
    public static void main(String[] args) {
        int a =10;
        int j=0;
        try {
            a=a/j;
            if(j==0){
                throw new ArithmeticException();
            }
        }catch(ArithmeticException ae){
            a=10/1;
            System.out.println("This values has been made default over zero division");
            System.out.println(ae);
        }
        System.err.println(a); // reachable code
    }
}