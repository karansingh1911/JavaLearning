
import java.util.Objects;

class T {

    private int id;
    private String name;

    public T(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
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
        final T other = (T) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.name, other.name);
    }

}

public class Teacher {

    public static void main(String[] args) {
        T t1 = new T(1, "Ram");
        T t2 = new T(1, "Shyam");
        T t3 = new T(1, "Shyam");

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t3.hashCode());

        // same initialisation creates diff memory address 
        System.out.println(t3 == t1);
        T t4 = t1;
        System.out.println(t4 == t1); // created with same memory address so equal 

    }
}
