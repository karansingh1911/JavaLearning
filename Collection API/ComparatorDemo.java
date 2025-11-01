
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 // Example : overriding the sort method from the collections
 public class ComparatorDemo{
    public static void main(String[] args){ // comparator is a functional Interface, so we can instantiate using anonymous inner class
        Comparator<String> c= (String a, String b)->{
                if(b.length()<a.length()){
                    return 1;
                }else{
                    return -1;
                }
            };

       
        // comparator is a functional Interface, so we can instantiate using anonymous inner class 
        List<String> l= new ArrayList<>();
        l.add("Here");
        l.add("Welcome");
        l.add("Hello");
        l.add("Hi");
        System.out.println(l);
        Collections.sort(l,c);
        System.out.println(l);


    }
 } 