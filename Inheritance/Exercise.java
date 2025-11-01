class Employee{
    private String name ="";
    private double salary;
    
     public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    
    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public void getDetails(){
        System.out.println("Name: "+this.name+", "+"Salary: "+this.salary );
    }
}
class Manager extends Employee{
    private String department="";
     public String getDepartment() {
        return department;
    }
    
    Manager(String name, double salary, String department){
        super(name,salary);
        this.department=department;
    }
    @Override
    public void getDetails(){
        System.out.println("Name: "+getName()+", "+"Salary: "+getSalary()+", "+"Department: " +getDepartment());
        
    }
    
}



public class Exercise{
    public static void main(String[] args){
    Employee e= new Employee("Alice", 50000.0);
    e.getDetails();
    Manager m= new Manager("Bob",80000.0,"IT");
    m.getDetails();
    
}
}