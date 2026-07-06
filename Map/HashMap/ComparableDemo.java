
import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student> {

    public Student(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    private String name;

    public String getName() {
        return name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }
    private Integer rollNumber;

    @Override
    public int compareTo(Student o) {
        // return this.getRollNumber() - o.getRollNumber(); // descending 
        // return o.getRollNumber() - this.getRollNumber(); // ascending 
        return Double.compare(this.getRollNumber(), o.getRollNumber());

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", rollNumber=").append(rollNumber);
        sb.append('}');
        return sb.toString();
    }
}

public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ram", 1));
        students.add(new Student("Raman", 2));
        students.add(new Student("Rami", 12));
        students.add(new Student("Ramesh", 9));
        students.sort(null);
        System.out.println(students);

    }

}
