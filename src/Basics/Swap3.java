package Basics;

public class Swap3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int brr[] = {5,4,3,2,1};
        System.out.println(arr[0] + " " + brr[1]);
        swap(arr,brr);
        System.out.println(arr[0] + " " + brr[1]);
    }
    public static void swap(int arr[], int brr[]){
        int [] temp = arr;
        arr = brr;
        brr = temp;
    }
}
