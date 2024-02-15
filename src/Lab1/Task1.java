package Lab1;
import java.util.Scanner;

class Change{
    int HalfDollar = 0;
    int Quarter = 0;
    int Dime = 0;
    int Nickel = 0;
    int Penny = 0;
    int Change;
}

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter change in cents: ");
        Scanner input = new Scanner(System.in);
        Change ChangeInit = new Change();
        ChangeInit.Change = input.nextInt();

        //Find amount of Half Dollars

        for(int i = 1; i <= ChangeInit.Change / 50; i++){
            ChangeInit.HalfDollar = ChangeInit.Change / 50;
            ChangeInit.Change = ChangeInit.Change % 50;
        }
        //Find amount of Quarters

        for(int i = 1; i<=ChangeInit.Change / 25; i++){
            ChangeInit.Quarter = ChangeInit.Change / 25;
            ChangeInit.Change = ChangeInit.Change % 25;
        }

        //Find amount of Dimes

        for(int i = 1; i<=ChangeInit.Change / 10; i++){
            ChangeInit.Dime = ChangeInit.Change / 10;
            ChangeInit.Change = ChangeInit.Change % 10;
        }

        //Find amount of Nickels
        for(int i = 1; i<=ChangeInit.Change / 5; i++){
            ChangeInit.Dime = ChangeInit.Change / 5;
            ChangeInit.Change = ChangeInit.Change % 5;
        }
        ChangeInit.Penny = ChangeInit.Change;
        System.out.println("Change formatted correctly: \n");
        System.out.println("Half Dollars: " + ChangeInit.HalfDollar);
        System.out.println("Quarters: " + ChangeInit.Quarter);
        System.out.println("Dimes: " + ChangeInit.Dime);
        System.out.println("Nickels: " + ChangeInit.Nickel);
        System.out.println("Pennies: " + ChangeInit.Penny);
    }

}
