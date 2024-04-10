package Apr10;
import java.util.*;
public class LinkedHashSetWithCustomObjectExample {
    public static void main(String[] args) {
        LinkedHashSet<Book> hs = new LinkedHashSet<Book>();
        //Creating books
        Book b1 = new Book(101, "C++ Programming", "Paramount", "Balls Publishing", 8);
        Book b2 = new Book(102, "Java Programming", "Telus", "Bell Media Publishing", 16);
        Book b3 = new Book(103, "FORTRAN Programming", "Rogers Communications", "Viacom", 3);
        //Adding books to HashTable
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        //Traverse Hash table
        for(Book b:hs){
            System.out.println(b.id+" " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }

    }
}
class Book {
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
