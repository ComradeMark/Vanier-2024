package Mar20;

public class GenericMethod1 {

    public static < E > void printArray(E[] elements){
        for ( E element : elements){
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        Character[] charArray = {'J', 'A', 'V', 'A', 'O', 'O', 'P'};
        System.out.println("Printing integer array: ");
        printArray(intArray);
        System.out.println("Printing character array");
        printArray(charArray);
    }

//Generic method arguments:
//T - Type
//E - Element
//K - Key
//N - Number
//V - Value

}
