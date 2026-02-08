package Arrays_basics;

import java.util.Scanner;

public class Arrays_inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArr(arr);
    }
        public static void printArr(int[] arr){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
