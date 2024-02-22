package Feb22;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        boolean unique = true;
        System.out.println("Input n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; n++) {
            int element;
            System.out.println("Input number " + i + " of" + n);
            element = input.nextInt();
            array.add(i, element);
            if (array.contains(element)) {
                unique = false;
            } else {
                break;
            }
        }
    }
}



