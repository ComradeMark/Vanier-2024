package Assignment1;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        int total = 0;
        Scanner choice = new Scanner(System.in);
        System.out.println("1: Mon 2: Tue 3: Wed");
        System.out.println("4: Thu 5: Fri 6: Sat");
        System.out.println("7: Sun");
        System.out.println("Which day are we? ");
        int day = choice.nextInt();
        switch(day){
            case 1, 2, 3, 4:
                System.out.println("Add a guest? y/n");
                char prompt = choice.next().charAt(0);
                while(prompt != 'n') {
                    System.out.println("How old is the guest ?");
                    int age = choice.nextInt();
                    Ticket t1 = new WeekDayTicket();
                    if (age <= 18) {
                        total = total + t1.getChildPrice();
                        break;
                    } else {
                        total = total + t1.getAdultPrice();
                        break;
                    }
                }


            case 5:
                System.out.println("How old is person 1 ?");
                System.out.println("Add a guest? y/n");

                char prompt1 = choice.next().charAt(0);
                while(prompt1 != 'n') {
                    System.out.println("How old is the guest ?");
                    int age = choice.nextInt();
                    Ticket t1 = new FridayTicket();
                    if (age <= 18) {
                        total = total + t1.getChildPrice();
                        break;
                    } else {
                        total = total + t1.getAdultPrice();
                        break;
                    }
                }
            case 6, 7:
                System.out.println("Add a guest? y/n");
                char prompt2 = choice.next().charAt(0);
                while(prompt2 != 'n') {
                    System.out.println("How old is the guest ?");
                    int age = choice.nextInt();
                    Ticket t1 = new WeekendTicket();
                    if (age <= 18) {
                        total = total + t1.getChildPrice();
                        break;
                    } else {
                        total = total + t1.getAdultPrice();
                        break;
                    }
                }
            default:
                System.out.println("Your total is: " + total +"$");
        }

    }




}

class Ticket{
    int childPrice;
    int adultPrice;

    public int getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(int childPrice) {
        this.childPrice = childPrice;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(int adultPrice) {
        this.adultPrice = adultPrice;
    }
}
class WeekDayTicket extends Ticket{
     WeekDayTicket(){
        this.adultPrice = 20;
        this.childPrice = 15;
    }
}
class FridayTicket extends Ticket{
    FridayTicket(){
        this.childPrice = 25;
        this.adultPrice = 30;
    }
}
class WeekendTicket extends Ticket{

    WeekendTicket(){
        this.childPrice = 35;
        this.adultPrice = 40;
    }
}
class Person{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(int age){
        this.age = age;
    }
    int age;
}


