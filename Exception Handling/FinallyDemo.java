
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyDemo{
    public static void main(String[] args) { // not preferred way of using throws 
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(in);
        try {
            int num = Integer.parseInt(br.readLine());
            System.out.println("Value for number is: " +  num);
            } catch(IOException ioe){
                System.out.println("Something went wrong while taking input");
            }
            catch(NumberFormatException nfe){
                System.out.println("The input provided isn't a number!");

            }finally{
            try {
                br.close();
            } catch (IOException ex) {
                System.out.println("Something went wrong while closing resources...");
            } 
            }
        
    }
}