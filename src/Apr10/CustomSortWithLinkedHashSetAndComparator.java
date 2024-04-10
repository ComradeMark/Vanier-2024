package Apr10;
import java.util.Comparator;
import java.util.*;
public class CustomSortWithLinkedHashSetAndComparator {

    public static void main(String[] args) {
        LinkedHashSet<friendsMarks> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(new friendsMarks("Mark", "qazwert", 92));
        linkedHashSet.add(new friendsMarks("David", "Dave", 67));
        linkedHashSet.add(new friendsMarks("Joachim", "jesus", 99));
        linkedHashSet.add(new friendsMarks("Steve", "Woz", 52));
        linkedHashSet.add(new friendsMarks("Arshneet", "ashu", 86));

    //Creating treeset, in which we must pass Comparator object of marksCompare class
    //So that we can sort according to marks
    TreeSet<friendsMarks> treeSet0 = new TreeSet<>(new marksCompare());
    //Storing elements of LinkedHashSet into TreSet by using addAll
        treeSet0.addAll(linkedHashSet);
        System.out.println("Sorting based on marks: ");
        //Displaying using loop
        for(friendsMarks tree : treeSet0)
            System.out.println(tree);

        TreeSet<friendsMarks>treeSet1 = new TreeSet<>(new nameCompare());
        treeSet1.addAll(linkedHashSet);
        System.out.println("\n\n Sorting based on name: ");
        for(friendsMarks tree1 : treeSet1){
            System.out.println(tree1);
        }

    }


}
class friendsMarks {
    String name;
    String nickName;
    int marks;

    public friendsMarks(String name, String nickName, int marks) {
        this.name = name;
        this.nickName = nickName;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String toString() {
        return "friendsMarks{" + "name'" + name + '\'' + ", nickName='" + nickName + '\'' + ", marks = " + marks + "";

    }
}
class nameCompare implements Comparator<friendsMarks>{
        public int compare(friendsMarks friend1, friendsMarks friend2)
        {
            return friend1.getName().compareTo(friend2.getName());
        }
}
class nickNameCompare implements Comparator<friendsMarks> {
    public int compare(friendsMarks obj1, friendsMarks obj2) {
        return obj1.getNickName().compareTo(obj2.getNickName());
    }
}
class marksCompare implements Comparator<friendsMarks>{
        public int compare(friendsMarks f1, friendsMarks f2){
            if(f1.getMarks() > f2.getMarks()){
                return 1;}
            else{return -1;}
            }
        }






