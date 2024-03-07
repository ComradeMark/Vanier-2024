package Lab2;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Create students:");
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(12, "Mark", 90));
        students.add(new Student(23, "Aman", 65));
        students.add(new Student(04, "Yip", 96));
        students.add(new Student(31, "Beatrice", 21));
        System.out.println("Students before sorting by Score using COMPARATOR");
        for(Student st : students){
            System.out.println("Student name: " + st.getName() + " Student ID: " + st.getID() + " Score: " + st.getScore());
        }
        System.out.println("Sort by Score using comparator");
        Collections.sort(students, new ScoreComparator());
        for(Student st : students){
            System.out.println(" Student name: " + st.getName() + " Student ID: " + st.getID() + " Score: " + st.getScore());
        }
        System.out.println("Sort by student ID (comparable");
        Collections.sort(students);
        for(Student st : students){
            System.out.println(" Student name: " + st.getName() + " Student ID: " + st.getID() + " Score: " + st.getScore());
        }




    }

}
class Student implements Comparable<Student>{
    public int ID;
    String name;
    double score;
    public Student(int ID, String name, double score){
        this.ID = ID;
        this.name = name;
        this.score = score;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.ID == o.getID()) return 0;
        else if(this.ID>o.getID()) return 1;
        else return -1;

    }
}

class ScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() > o2.getScore()) return 1;
          if (o1.getScore() == o2.getScore()) return 0;

         else return -1;
    }
}






