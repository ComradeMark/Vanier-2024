package Feb22;
import java.util.ArrayList;
import java.util.Collections;
class Author implements Comparable<Author>{ //Comparable compares two objects of same type
    //Lets you do custom sorting

    String firstName;
    String bookName;
    String lastName;

    public Author(String firstName, String bookName, String lastName) {
        this.firstName = firstName;
        this.bookName = bookName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Author o) {
        return this.lastName.compareTo(o.lastName); //Takes one value of author and repeatedly compares
        //Sorts based on last name
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Author> authorlist = new ArrayList<Author>();
        authorlist.add(new Author("Elon", "Be cool", "Musk"));
        authorlist.add(new Author("Bill", "Be a loser", "Gates"));
        authorlist.add(new Author("Steve", "Apple", "Jobs"));
        Collections.sort(authorlist);
        System.out.println("Sorted authors by last name");
        for(Author a : authorlist){
            System.out.println(a.firstName + " " + a.lastName + " " + a.bookName);
        }




    }


}
