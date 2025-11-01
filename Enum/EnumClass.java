// Note: you can create the object of a class inside a class but make sure to define constructor as private- it works!!
enum Laptop{

    Macbook(2000),Predator(1800),Dell(400),Lenovo;

    private final int price;

    private Laptop() {
        this.price=500;
    }

    private Laptop(int price) {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }
    

}
public class EnumClass{
    public static void main(String[] args){
        // Laptop lap1= Laptop.Lenovo;
        // System.out.println("lap");
        // System.out.println(lap1.getPrice());
        for(Laptop lap: Laptop.values()){
            System.out.println(lap+ ": "+lap.getPrice());
        }
        
    }
}
// Example review: 
// class DatabaseConnection {
//     private static DatabaseConnection instance;

//     private DatabaseConnection() {
//         System.out.println("Connection created");
//     }

//     public static DatabaseConnection getInstance() {
//         if (instance == null) {
//             instance = new DatabaseConnection(); // ✅ allowed
//         }
//         return instance;
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         // DatabaseConnection db = new DatabaseConnection(); ❌ Not allowed
//         DatabaseConnection db1 = DatabaseConnection.getInstance();
//         DatabaseConnection db2 = DatabaseConnection.getInstance();
//         System.out.println(db1 == db2); // ✅ true (same object)
//     }
// }


// ✅ The class itself creates its object internally.
// ✅ No one outside can create another object.
// ✅ Guarantees a single, controlled instance.