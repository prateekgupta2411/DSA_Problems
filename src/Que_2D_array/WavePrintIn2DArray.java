package Que_2D_array;

public class WavePrintIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}   // 5 x 4 matrix
        };

        printWave(arr);
    }

    public static void printWave(int[][] arr) {

        // Loop through columns
        for (int col = 0; col < arr[0].length; col++) {

            // Even column → top to bottom
            if (col % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
            // Odd column → bottom to top
            else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}