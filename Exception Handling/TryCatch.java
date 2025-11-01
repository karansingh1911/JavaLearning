


class TryCatch{
    public static void main(String[] args) {
        int marks=10;
        int arr[]= new int[5];
        try {
            int result= marks/0;
            result = arr[10];
        } catch (ArithmeticException e1) {
            System.out.println(e1);
            System.out.println("Error is: " + e1.getMessage()); // to handle /10 exception 
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Error is: " + e2.getMessage()); // to handle out of bounds exception
        }catch(Exception e){
            System.out.println("Something went wrong...");
        }
    }
}