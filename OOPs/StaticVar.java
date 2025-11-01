

class Mobile{
    static String category= "Smartphone";
    int price;
    void showMobile(){
        System.out.println("Price: "+price + "Category: "+ category);
    }
}

class StaticVar{
    public static void main(String[] args){
        Mobile samsung=new Mobile();
        samsung.price=50000;
        Mobile apple =new Mobile();
        apple.price=100000;

        samsung.showMobile();
        apple.showMobile();
        
        //identityHashCode:  basically a JVM-generated ID based on the object’s reference (not the true memory address).
        System.out.println(System.identityHashCode(Mobile.category)); // access it with mobile. notation 
        System.out.println(System.identityHashCode(Mobile.category));

        // doing changes to static variable
        Mobile.category="Camera Phone";
        apple.showMobile();
        samsung.showMobile();

    }
}