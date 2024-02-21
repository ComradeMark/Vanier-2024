package Feb21;
import java.util.Arrays;

//ARRAYS CLASS: A class that contains some static methods that are used with arrays
//Sorting, searching, comparing, filling, returning a string representation of an array
public class ArrayClass {

    public static void main(String[] args) {
        //Using Arrays.sort
        int[] numbers = {5, 2, 3, 8, 7, 6};
        Arrays.sort(numbers);
        char[] characters = {'a', 'z', 'b', 'g', 's', 'x', 'f'};
        Arrays.sort(characters);
        //sort(array, fromIndex, toIndex): sort from (fromIndex) to (toIndex - 1)
        Arrays.sort(numbers, 1, 4);

//Searching arrays - inbuilt binary search
        //if element present: index thrown
        //if element not found: -(insertionIndex + 1) thrown --> Where the value would fit in the array in a sorted way (negated)
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));

        String[] strings = {"a", "b", "c"};
        System.out.println(Arrays.binarySearch(strings, "d")); //D Would fit in place number 3 -> insertionIndex = 3+1 = 4 -> Return -4

        //Comparing arrays

        int[] numbers1 = {5, 4, 3, 2, 1, 0, -1};
        int[] numbers2 = {5, 4, 3, 2, 1, 0, -1};
        int[] number3 = {1, 2, 3, 4, 7, 7, 8, 1};

        // == compares memory location, thus can't be used to compare array values
        //must use equals method from String Array Class
        System.out.println(numbers1 == numbers2); //returns false
        System.out.println(Arrays.equals(numbers1, numbers2)); //returns true
        System.out.println(Arrays.equals(numbers1, number3)); //returns false

        //Using fill()
        //fill(array, value) fills whole array with value
        int[] testnumbers1 = new int[8];
        Arrays.fill(testnumbers1, 3);

        //fill(array, fromIndex, toIndex, value)
        int[] testnumbers2 = new int[8]; //Creates empty array with 0 everywhere
        Arrays.fill(testnumbers2, 3, 6, 1);

        //Printing arrays - use toString() method
        System.out.println(Arrays.toString(testnumbers2));


    }
}
