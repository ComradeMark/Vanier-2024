package Lab2;

import Feb29.ExceptionDemo4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Enter the value of a: ");
            double a = input.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = input.nextDouble();
            System.out.print("Enter the value of c: ");
            double c = input.nextDouble();
            findRoots(a, b, c);
        }
            catch (InputMismatchException e1){
                System.out.println("Input must be a double: " + e1);
            }
    finally{
            System.out.println("Program terminated.");
            input.close();
        }
        }



     static void findRoots(double a, double b, double c){
         double d = b * b - 4.0 * a * c;
         if (d > 0.0) {
             double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
             double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
             System.out.println("The roots are " + r1 + " and " + r2);
         } else if (d == 0.0) {
             double r1 = -b / (2.0 * a);
             System.out.println("The root is " + r1);
         } else {
             System.out.println("Roots are not real.");
         }
    }
}
