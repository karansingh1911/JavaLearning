class Mobile{
    int price;
    String brand;
    public Mobile(){
         price=0;
         brand= " ";
        System.out.println("Object created");
    }
    static{
        String catogory ="Smartphone";
        System.out.println("class has been loaded in the class Loader - JVM ");  

    }

}
class StaticBlock{
    public static void main(String[] args ) throws Exception{
        // Mobile m1= new Mobile();
        // Mobile m2= new Mobile();
        // m1.brand = "samsung";
        // m2.brand = "apple";
        Class.forName("Mobile");
    }
}