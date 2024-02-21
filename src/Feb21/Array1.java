package Feb21;

public class Array1 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd'};
        System.out.println(chars[1]);

        int[] numbers = {0,1};
        printArray(numbers);  //An array can be passed as an argument for a method
        change(numbers); //Function to inverse numbers (parameterized)
        printArray(numbers); //Array printed after change

    }

public static void change(int[] numbers){
        numbers[0] = 1;
        numbers[1] = 0;
}
public static void printArray(int[] numbers){
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
}
}

