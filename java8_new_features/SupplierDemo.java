// supplier use-case is to supply a certain value(primitive /  object) whenever its invoked with its get() method 

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            return "this string is supplied when I'm used!";
        };
        System.out.println(supplier.get());
    }
}
