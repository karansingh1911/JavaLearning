// NOTE: Rule of thumb
// Don’t override hashCode() alone.
// Always override equals() and hashCode() together, so they stay consistent:
// If a.equals(b) == true → then a.hashCode() == b.hashCode() must also be true.

import java.util.Objects;

class Student {
    String name;
    int rank; 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append(", rank=").append(rank);
        sb.append('}');
        return sb.toString();
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.rank != other.rank) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + this.rank;
        return hash;
    }
}
public class Hashcode{
    public static void main(String[] args){
        Student s1= new Student();
        s1.name="Karan";
        s1.rank=1;
        
        Student s2= new Student();
        s2.name="Karan";
        s2.rank=1;

        System.out.println(s1.equals(s2)); // if both arent equal then why? lets check for hashcode
        System.out.println(s1);
        System.out.println(s1.toString());
    }
    

}