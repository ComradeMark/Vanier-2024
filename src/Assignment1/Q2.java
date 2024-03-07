package Assignment1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Driver{
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many strings would you like to enter?");
        n = input.nextInt();
        ArrayList<String> strings = new ArrayList();
        for(int i = 0; i<n; i++){
            System.out.println("Enter value of entry " + (i+1));
            strings.add(input.next());
        }
        strings = removeDuplicates(strings);
        Collections.sort(strings);
        strings = removeDuplicates(strings);
        System.out.println(strings);

    }

public static ArrayList<String> removeDuplicates(ArrayList<String> strings){
        ArrayList<String> nonDupe = new ArrayList();
        for(int i = 0; i<strings.size();i++){
            if(!nonDupe.contains(strings.get(i))){
            nonDupe.add(strings.get(i).toLowerCase());}
        }
    return nonDupe;
    }

}