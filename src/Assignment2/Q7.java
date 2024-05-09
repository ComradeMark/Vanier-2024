package Assignment2;
//Write a java program to convert the postfix express to infix expression using
//Stack (Algorithm is given below)
import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input: ");
        String in = input.nextLine();
        System.out.println("Output: " + toPrefix(in));

    }
    public static String toPrefix(String input){
        String finalString = "";
        Stack<String> postfix = new Stack<>();
        for(int i = 0; i<input.length(); i++){
          char symbol = input.charAt(i);
          if(symbol >=48 && symbol <=57 || symbol >= 61 && symbol <= 122) {//case for operand
              postfix.push(String.valueOf(symbol));
          }
          else if(symbol >=42 && symbol <=47){ //case for operator
              String el1 = postfix.pop();
              String el2 = postfix.pop();
              String expression;
              expression = "("+el2+")" + symbol + "("+el1+")";
              postfix.push(expression);
          }

      }
        if(postfix.size() == 1){
             finalString = postfix.pop();
        } return finalString;
    }
}
