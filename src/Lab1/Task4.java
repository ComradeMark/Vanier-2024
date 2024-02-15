package Lab1;
import java.util.Scanner;
class Book {
    String[] title = new String[15];
    String[] publisher = new String[15];
    int[] ISBN = new int[15];
    int[] price = new int[15];
    int[] year = new int[15];
    int[] stock = new int[15];
    static int quantity;
    Book(int qty) {
        quantity=qty;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < qty; i++) {
            System.out.println("Title? ");
            title[i] = input.nextLine();
            System.out.println("Publisher? ");
            publisher[i] = input.nextLine();
            System.out.println("ISBN? ");
            ISBN[i] = input.nextInt();
            System.out.println("Price? ");
            price[i] = input.nextInt();
            System.out.println("Year? ");
            year[i] = input.nextInt();
            stock[i] = qty;
        }

    }

void viewBook(){
    System.out.println("Books available: ");
    for(int i = 0; i<quantity; i++){
        System.out.print(title[i] + ',');
        }
}
void checkTitle(String tit){
    for(int i = 0; i<quantity; i++){
        if(title[i] == tit){
            System.out.println("Book is in system");
        }
        else{
            System.out.println("Book not in system");
        }
    }


}
}
public class Task4 {
    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);

        System.out.println("You have chosen to add a new book to the system");
        System.out.println("How many books would you like to add?");
        int stock = choice.nextInt();
        Book book1 = new Book(stock);
        System.out.println("Welcome to the library management system. Select your desired option: ");
        System.out.println("1 - Add new book to library\n2 - View current books in library\n3 - Search for a title");
        int sel = choice.nextInt();
        while(sel <=3){
        switch(sel) {
            case 1:
                Book book2 = new Book(stock);
            case 2:
                System.out.println("You have chosen to show available books");
                book1.viewBook();

            case 3:
                System.out.println("Check if inputted title matched books in stock");
                String tit = choice.nextLine();
                book1.checkTitle(tit);
        }

        }
        }
    }

