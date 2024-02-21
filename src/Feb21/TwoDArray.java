package Feb21;
import java.util.Arrays;
public class TwoDArray {
    public static void main(String[] args) {
        //int[][] numbers; //null
        //[] rows []columns
        int[][] numbers = new int[5][3];
        //Accessing elements //numbers[row][column]
        int[][] integers = new int[2][2];
        integers[0][0] = 3;
        integers[0][1] = 5;

        //Printing row by row
        int[][] integers2 = {{3, 5, 7}, {10, 2, 9}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(integers2[i][j] + " ");
            }
        }
        //print column by column
        System.out.print(integers2[0][0] + " ");
        System.out.print(integers2[1][0] + " ");
        System.out.print(integers2[0][1] + " ");
        System.out.print(integers2[1][1] + " ");
        System.out.print(integers2[0][2] + " ");
        System.out.print(integers2[1][2] + " ");

        //toString equivalent
        int[][] integers3 = {{3, 5, 7}, {10, 2, 9}};
        System.out.println(Arrays.deepToString(integers3));

        //Ragged arrays are 2D arrays with rows of different lengths
        int[][] integers4 = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9, 4, 10}
        };
        printArray(integers4);


        //Find sum of each row and column

        int row = 0;
        int column = 0;
        int[][] integers5 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 15}};
        //Must know amount of rows or columns to continue, if RAGGED array, assume value of 0 for null parts
        int columnqty = 4;
        int rowqty = 4;
        //Row sum
        for (int i = 0; i < rowqty-1; i++) {
            for (int j = 0; j < rowqty; j++) {
                row = row + integers5[i][j];
            }
        }
            for (int l = 0; l < columnqty-1; l++) {
                for (int m = 0; m < rowqty; m++) {
                    column = column + integers5[l][m];
                }
            }

                System.out.println(row + " " + column);


            }



public static void printArray(int[][]integers4){
        for(int i = 0; i<integers4.length; i++){
            for(int j = 0; j<integers4[i].length; j++){
                System.out.println(integers4[i][j] + " ");
            }
        }
}

}
