// Concept is passing a function to a function as a reference and we must pass the className as well its very important!!!

import java.util.Arrays;
import java.util.List;


public class MethodReferenceDemo{
    public static void main(String[] args){
        List<String> s= Arrays.asList("karan Singh", "Ram", "Rahim");
        
        List<String> inUpperCase = s.stream()
                        . map(String::toUpperCase) // this gives stream
                        .toList(); // this converted stream into List 
        inUpperCase.forEach(System.out::println);

    }
}