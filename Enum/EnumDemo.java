import java.util.Arrays;

enum Status{
    Running, Failed, Success, Pending;

    @Override
    public String toString() {
      return ordinal() + ": " + name();
    }
}
public class EnumDemo{
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s); //Status{}
        System.out.println(s.ordinal()); //0
        Status[] s1 = Status.values();
        // System.out.println(s1); //[LStatus;@2f92e0f4
        System.out.println(Arrays.toString(s1)); // [Status{}, Status{}, Status{}, Status{}]
    }
}