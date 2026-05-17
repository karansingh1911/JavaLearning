// Function<T,R> is also functional Interface however it can take any arg(T), apply then return anything(R) in short and does some work as well (predicate + work and logic)
// the reverse of andThen() is compose() - given for order reversal of chaining

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Student {

    private Integer id;
    private String name;
    private Integer marks;

    public Student(Integer id, Integer marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }
}

public class FunctionDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Function<String, String> threeSubStrings = s -> s.substring(0, 3);
        Function<String, String> upperCase = s -> s.toUpperCase();
        Function<String, Boolean> ifAllThreeKarAndUpper = threeSubStrings
                .andThen(upperCase).andThen(s -> s.equals("KAR"));
        System.out.println(ifAllThreeKarAndUpper.apply("karan"));
        System.out.println(ifAllThreeKarAndUpper.apply("Karan"));
        Student s1 = new Student(1, 99, "karan");
        Student s2 = new Student(2, 69, "Kamran");
        Student s3 = new Student(3, 46, "kiran");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Function< List<Student>, List<Student>> listOfFilteredStudents = studentList -> {
            List<Student> studentsStartingWithKar = new ArrayList<>();
            for (Student student : studentList) {
                if (threeSubStrings.apply(student.getName()).equalsIgnoreCase("kar")) {
                    studentsStartingWithKar.add(student);
                }

            }
            return studentsStartingWithKar;

        };

        System.out.println(listOfFilteredStudents.apply(students));

    }
}

// Small single-purpose functions
// ↓
// compose safely
// ↓
    // reorder easily
