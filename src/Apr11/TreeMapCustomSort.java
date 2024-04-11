package Apr11;

import java.util.*;
public class TreeMapCustomSort {
    static void Example2ndConstructor(){
        TreeMap<Student,Integer> treeMap0 = new TreeMap<Student,Integer>(new Sortbyroll());
        treeMap0.put(new Student(111, "nnnn", "test2"), 2);
        treeMap0.put(new Student(222, "bbbb", "test3"), 3);
        treeMap0.put(new Student(131, "cccc", "test4"), 1);
        System.out.println("TreeMap: " + treeMap0);
    }
    public static void main(String[] args) {

        System.out.println("TreeMap using +");
        Example2ndConstructor();

    }

}
class Student{
    int rollno;
    String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
class Sortbyroll implements Comparator<Student>{
    //Used for sorting in ascending order of roll numbers
    public int compare(Student a, Student b){
        return a.rollno-b.rollno;
    }
}