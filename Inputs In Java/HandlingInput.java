
import java.util.Scanner;


// there are two ways to take input in java:
// 1. BufferReader which is a lengthy process or we can use
// 2. Scanner class with scanner object
// Note: since the Scanner is a resource we need to close the file after using it to prevent leakage!!!
public class HandlingInput{
    public static void main(String[] args) {
        System.out.println("Enter a number");

        Scanner sc= new Scanner(System.in); // using resource
        int num = sc.nextInt(); 

        System.out.println(num);

        sc.close(); // closing resource
    }
}