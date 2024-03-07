package Lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int n = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many strings would you like to enter?");
        n = input.nextInt();
        ArrayList<Integer> ints = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Adding num " + i + " out of" + n);
            ints.add(input.nextInt());
        }
        findNumDuplicates(ints);
    }

    public static ArrayList<Integer> findNumDuplicates(ArrayList<Integer> numbers) {

        ArrayList<Integer> repeatednums = new ArrayList<>();
        int repeated = 0;
        Collections.sort(numbers);
        for (int l = 0; l < numbers.size(); l++) {
            if (!repeatednums.contains(numbers.get(l))) {
                repeatednums.add(l, numbers.get(l));

            }

        }
        for(int p = 0; p< repeatednums.size(); p++){
            if(numbers.get(p).equals(repeatednums.get(p))){
                repeated++;
                System.out.println("Character " + numbers.get(p) + " repeated " + repeated);
            }
        }
    return repeatednums;
    }
}

