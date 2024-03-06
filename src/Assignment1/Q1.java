package Assignment1;
import java.util.Scanner;
import java.util.Arrays;
public class Q1 {

    public static void main(String[] args) {
        boolean mainLoop = true;
        String[] array = new String[10];

        Scanner choice = new Scanner(System.in);
        while (true) {
            System.out.println("Select your desired option: ");
            System.out.println("1 - Add an element to array\n2 - Find repeated elements in array\n3 - Determine size of the array\n4 - Display element with greatest number of repetitions\n5 - Remove element\n6 - Sort\n7 - Display array\n8 - Exit");
            int pick = choice.nextInt();

            //default array

            switch (pick) {
                case 1: //Add element

                    System.out.println("Add to array: ");
                    String input = choice.next();
                    array = add(input, array);
                    System.out.println("Element " + input + " successfully added");
                    break;

                case 2: //Find repeated elements

                    findRepeat(array);
                    break;

                case 3: //Size of array
                    arraySize(array);
                    break;
                case 4: //Display element most repeated
                    MostRepeated(array);
                    break;

                case 5: //Remove element
                    System.out.println("Element to remove?");
                    String toRemove = choice.next();
                    removeElement(array, toRemove);
                    break;
                case 6: //Sort
                    sort(array);

                    break;
                case 7: //Display
                    System.out.println(Arrays.toString(array));
                    break;
                case 8: //Exit
                    System.exit(1);
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;

            }


        }

    }

    public static String[] add(String input, String[] array) {
//Adds element to array
        int elements = 0;
        //Determine current amount of elements in array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                continue;
            } else {
                elements = i;
                break;
            }
        }
        array[elements] = input;
        return array;
    }

    public static void findRepeat(String[] array) {

        //Sorts array first
        int elements = 0;
        String repeatedterm = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                continue;
            } else {
                elements = i;
                break;
            }
        }
        Arrays.sort(array, 0, elements);
        int repeated = 0;
        for (int i = 0; i < elements; i++) {
            if (array[i] != null) {
                if (array[i].equals(array[i + 1])) {
                    System.out.println(array[i] + " is repeated by: " + array[i + 1]);
                    repeated++;
                }
            }
        }
        System.out.println("Total repeated terms: " + repeated);
        System.out.println(Arrays.toString(array));

    }

    public static void arraySize(String[] array) {
        int elements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                continue;
            } else {
                elements = i;
                break;
            }

        }
        System.out.println("Array has " + elements + " elements");

    }

    public static void MostRepeated(String[] array) {

    }

    public static void sort(String[] array) {
        int elements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                continue;
            } else {
                elements = i;
                break;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Sorting array...");
        Arrays.sort(array, 0, elements);
        System.out.println(Arrays.toString(array));
    }

    public static void removeElement(String[] array, String toRemove){

        int elements = 0;
        for (int l = 0; l < array.length; l++) {
            if (array[l] != null) {
                continue;
            } else {
                elements = l;
                break;
            }
        }
        Arrays.sort(array, 0, elements);

        int indexToRemove = 0;
        for(int i = 0; i<array.length-1; i++){
            if(array[i].equals(toRemove)){
                indexToRemove = i;
                array[i] = null;
                break;
            }
            else if(i >= array.length){
                System.out.println("Not present in array. Try again with different input.");
            }
            else if(array[i] == (null)){
                continue;
            }


        }
        //Resorts array after deletion
        System.out.println(Arrays.toString(array));


    }


}