package Apr11;

import java.util.*;
import java.util.LinkedHashMap;

public class LinkedHashMapWithCustomObject {
    public static void main(String[] args) {
        Map<Integer,Book>map = new LinkedHashMap<Integer,Book>();
        Book b1 = new Book(101, "C Programming", "Balls", "Balls Publishing", 8);
        Book b2 = new Book(102, "C++ Programming", "Bell", "Bell Publishing", 12);
        Book b3 = new Book(103, "Java Programming", "Oracle", "Oracle Publishing", 2);
        map.put(2, b2);
        map.put(1,b1);
        map.put(3,b3);
        for(Map.Entry<Integer,Book> entry:map.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details: ");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
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
