package Lab2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> randomNums = new ArrayList<>();
        System.out.println("Input number of elements to add to ArrayList: ");
        int n = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Input number " + (i + 1) + " out of " + n);
            randomNums.add(input.nextInt());
        }
        System.out.println("Current array: " + randomNums);
        for (int l = 0; l < randomNums.size(); l++) {
            if (randomNums.get(l) % 2 != 0) {
                randomNums.set(l, null);
            }
        }
        System.out.println("Array with odd numbers removed (+sorted): ");
        while(randomNums.contains(null)){
        randomNums.remove(null);}

        Collections.sort(randomNums);
        System.out.println(randomNums);

    }
}
