 // forEach method implementation
import java.util.Arrays;
import java.util.List;
public class ForEachDemo{
    public static void main(String[] args){
        List<Integer> nums =  Arrays.asList(1,5,3,4); 
        nums.forEach(num-> System.out.println(num)); 
       
    }
} 

 // converting this into lambda above after learning internal working
// List<Integer> nums =  Arrays.asList(1,5,3,4); 
//         Consumer<Integer> con = new Consumer<Integer>(){
//             @Override
//             public void accept(Integer num){
//                 System.out.println(num);
//             }
//         }

