package Feb22;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Author1{
    String firstName;
    String bookName;
    int authorAge;

    public Author1(String firstName, String bookName, int authorAge) {
        this.firstName = firstName;
        this.bookName = bookName;
        this.authorAge = authorAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }
}

public class ComparatorDemo {

    //Sorted based on age
    public static void main(String[] args) {
        ArrayList<Author1> s = new ArrayList<>();
        s.add(new Author1("Bill", "Balls", 28));
        s.add(new Author1("Gates", "Amogus", 18));
        s.add(new Author1("Imposter", "Sus", 99));
        s.add(new Author1("Barack", "Bomb", 67));
        Collections.sort(s,new AuthorAgeComparator());
        System.out.println("Sorted by author age: ");
        for(Author1 pr : s){
            System.out.println(pr.getAuthorAge() + " " +  pr.bookName + " " + pr.firstName);
        }

        //Sorted based on book name
        Collections.sort(s, new BookNameComparator());
        System.out.println("Sorted by book name: ");
        for(Author1 pr2 : s){
            System.out.println(pr2.authorAge + " " + pr2.getBookName() + " " + pr2.firstName);
        }




    }



}
class AuthorAgeComparator implements Comparator<Author1>{


    //Sorts by author age
    @Override
    public int compare(Author1 o1, Author1 o2) {
if(o1.authorAge == o2.authorAge) return 0;
    else if(o1.authorAge > o2.authorAge) return 1;
    else return -1;
    }
}
//Each comparator needs its own class
class BookNameComparator implements Comparator<Author1>{

    @Override
    public int compare(Author1 o1, Author1 o2) {
        return o1.bookName.compareTo(o2.bookName);

    }
}
//Use of comparable affects one memory location (real object's memory)
//Comparator uses more memory  (creates new class)
