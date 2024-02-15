package Lab1;
import java.sql.SQLOutput;
import java.util.Scanner;


class Contents{
    int letters = 0;
    int spaces = 0;
    int digits = 0;
    int others = 0;

}
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Input line: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        Contents sen1 = new Contents();

        //Parse the sentence: if current index can be divided by 1, it is a number
        for(int i = 0; i<str.length(); i++){
            char compareTo;
            compareTo = str.charAt(i);
            if(compareTo >= 48 && compareTo <= 57){
                sen1.digits++;
            }
            if(str.charAt(i) == ' '){
                sen1.spaces++;
            }
            if(compareTo >= 65 && compareTo <= 90 || compareTo >= 97 && compareTo <= 212){
                sen1.letters++;
            }

            sen1.others = str.length() - sen1.digits - sen1.letters - sen1.spaces;
        }


        System.out.println("Letters: " + sen1.letters);
        System.out.println("Digits: " + sen1.digits);
        System.out.println("Spaces: " + sen1.spaces);
        System.out.println("Others: " + sen1.others);




    }


}
