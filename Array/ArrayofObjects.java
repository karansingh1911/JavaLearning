class Student{
    int rank =0;
    String name= "";
    int age=0;
}

public class ArrayofObjects{ // containing main method
    public static void main(String[] args){
        Student studs[]=new Student[3];
        Student s1=new Student();
        studs[0] =s1;

        Student s2=new Student();
        studs[1] =s2;

        Student s3=new Student();
        studs[2] =s3;

        s1.rank=1;
        s1.name= "Karan";
        s1.age=21;

        s2.rank=1;
        s2.name= "Rahul";
        s2.age=23;

        s3.rank=1;
        s3.name= "Navin";
        s3.age=50;
        for (Student stud: studs){
                System.out.print(stud.name+ " ");
                System.out.print(stud.age+ " ");
                System.out.print(stud.rank+ " ");
                System.out.println("");

            }
            
        }


}