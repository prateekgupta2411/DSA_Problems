package Basics;

public class Swap_Nahi_Hoga { // swap nhi hua because stack me change hua he local m
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(arr[0] + " " + arr[1]);
        swap(0,1);
        System.out.println(arr[0] + " " + arr[1]);
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        a = temp;
    }
}
