import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Student implements Comparable<Student> { // here we will use comparable to compare diff. students
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("age=").append(age);
        sb.append(", name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    @Override 
    public int compareTo(Student s){
       return Integer.compare(this.age, s.age); // internally sorting logic implemented in this 
    }
    
}

public class ComparableDemo{
    public static void main(String[] args){
        // Comparator<Student> com = new Comparator<Student>(){
        //     @Override
        //     public int compare(Student s1,Student s2){
        //         if (s1.age>s2.age) {
        //             return 1; // return 1 means swap 
        //         }else if(s1.age== s2.age){
        //             return 0;  // do'nt swap 
        //         } else {
        //             return -1;
        //         }
        //     }
        // };
        List<Student> s= new ArrayList<>();
        s.add(new Student(10,"Karan"));
        s.add(new Student(1,"Ram"));
        s.add(new Student(5,"Rahim"));
        System.out.println(s);
        Collections.sort(s);
        System.out.println(s);
        
    }
}