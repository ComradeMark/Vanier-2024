package Apr17;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        //Bubble sort
        System.out.println("Bubble sort: ");
        System.out.println(Arrays.toString(bubblesort()));


        //Selection sort
        System.out.println("Selection sort: ");
        System.out.println(Arrays.toString(selectionsort()));


        //QuickSort
        System.out.println("Quick Sort: ");
        int[] numbers = {15, 23, 199, 153, 54, 87, 98};
        int n = numbers.length;
        quickSort(numbers, 0, n - 1);
        System.out.println(Arrays.toString(numbers));


        //Fix insertion sort code
        System.out.println("Insertion sort: to fix ");
       // System.out.println(Arrays.toString(insertionSort()));

        //Merge sort
        System.out.println("Merge sort: ");
        int[] array = new int[] {3, 9, 10, 1, 8, 7, 5, 2};
        mergeSort(array);
        System.out.println(Arrays.toString(array));

        //Heapsort
        //Complete after BST

    }


    static int[] bubblesort() {
        //Bubble sort: compares two adjacent items
        //Larger items bubble right
        int[] numbers = {15, 23, 199, 153, 54, 87, 98};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int l = 0; l < numbers.length - 1 - i; l++) {
                if (numbers[l] > numbers[l + 1]) {
                    int temp = numbers[l];
                    numbers[l] = numbers[l + 1];
                    numbers[l + 1] = temp;
                }

            }
        }

        return numbers;
    }

    //Selection sort is efficient and is based on comparison operations. It adds one element in each iteration.
    //You need to select the smallest element in the array and move it to the beginning of the array by swapping with the front element
    public static int[] selectionsort() {
        int[] numbers = {15, 23, 199, 153, 54, 87, 98};
        int u, j, minValue, minIndex, temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            minValue = numbers[i];
            minIndex = i;

            for (j = i; j < numbers.length; j++) {
                if (numbers[j] < minValue) {
                    minValue = numbers[j];
                    minIndex = j;
                }
            }
            if (minValue < numbers[i]) {
                temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }

        }
        return numbers;
    }


    public static int[] insertionSort() {
        //Insertion sort places an unsorted element at its suitable place in each iteration.
        //It works similarly as we sort cards in our hand in a card game. We assume that the first element is already sorted, then we select an unsorted card
        int[] numbers = {15, 23, 199, 153, 54, 87, 98};
        int temp;
        int loc;
        for (int i = 1; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i + 1];
                loc = i + 1;
                while (loc != 1 && numbers[loc - 1] > temp) {
                    numbers[loc] = numbers[loc - 1];

                }
                numbers[loc] = temp;
            }
        }
        return numbers;
    }


    static void quickSort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(array, lowIndex, highIndex);
            quickSort(array, lowIndex, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, highIndex);
        }
    }

    static int partition(int[] array, int lowIndex, int highIndex) {
        int pivot = array[highIndex];
        int i = (lowIndex - 1);

        for (int j = lowIndex; j < highIndex; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, highIndex);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


        //Merge sort is a divide and conquer algorithm, wherein we first divide the problem into subproblems.
        //When the solutions for the subproblems are ready, we combine them together to get the final solution to the problem.
        public static void mergeSort(int[] array) {
            if (array == null || array.length <= 1) {
                return;
            }

            // Break the array in two halves
            int mid = array.length / 2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[array.length - mid];

            System.arraycopy(array, 0, leftArray, 0, mid);

            if (array.length - mid >= 0)
                System.arraycopy(array, mid, rightArray,
                        0, array.length - mid);

            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(leftArray, rightArray, array);
        }

        private static void merge(int[] leftArray,
        int[] rightArray, int[] array) {
            int i = 0, j = 0, k = 0;

            // Effectively sorts left and right array
            while (i < leftArray.length && j < rightArray.length) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k++] = leftArray[i++];
                } else {
                    array[k++] = rightArray[j++];
                }
            }
            while (i < leftArray.length) {
                array[k++] = leftArray[i++];
            }
            while (j < rightArray.length) {
                array[k++] = rightArray[j++];
            }
        }
    }





