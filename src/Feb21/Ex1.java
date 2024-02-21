package Feb21;
import java.util.Scanner;
import java.util.Arrays;
public class Ex1 {
    public static void main(String[] args) {
        System.out.println("How many integers? ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

            if (n >= 1 && n <= 10) {
                int[] array = new int[n];
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Input number: ");
                    array[i] = input.nextInt();
                }
                System.out.println(Arrays.toString(array));
            } else {
                System.out.println("Input number between 1 and 10");

            }

    }
}
