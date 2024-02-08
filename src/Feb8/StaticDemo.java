package Feb8;

class Student{
    int rollNo;
    String name;
    static String collegeName = "Vanier";

    static void change(){ //STATIC METHOD CANNOT ACCESS NON STATIC VARIABLES --> STATIC METHODS ONLY HAVE STATIC VARIABLES
        collegeName = "MontrealnewCegep";
        System.out.println("The new college name is: " + collegeName);
    }


    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display(){
        System.out.println("Student name "
                + name + " " + " roll number" + " " +
                rollNo + " " + collegeName);

    }
}


public class StaticDemo {
    public static void main(String[] args) {
        Student.change(); //USES STATIC METHOD
        Student student1 = new Student(11, "Mark");
        Student student2 = new Student(5, "James");
        student1.display();
        student2.display();
        //NOTICE HOW VANIER COLLEGE APPEARS AS THE COLLEGE NAME FOR ALL STUDENTS
        //STATIC SHARES MEMORY BETWEEN OBJECTS AND LETS YOU ALLOCATE ONLY ONE MEMORY LOCATION FOR ONE VALUE (FOR THE WHOLE PROGRAM)

    }



}
