class Parent {
    public void showAnotherClass() throws ClassNotFoundException 
    {
        Class.forName("someClass"); 
        // here we are checking class which doesn't exist in Parent Class
        // basically the exception has been ducked by showAnotherClass and handled in main 
    }
}

public class ThrowsDemo{
    public static void main(String[] args){
        Parent p=new Parent();
        try {
            p.showAnotherClass();
        } catch (ClassNotFoundException ex) {
            System.out.println("the exception has been ducked by showAnotherClass and handled in main! ");
        }

    }
}
