package array_26jan;

public class Product_Of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int[] ans = productArray(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] +" ");
        }
    }
    public static int[] productArray(int arr[]){
        int n = arr.length;
        // left product except self
        int left[] = new int[n];
        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * arr[i-1];
        }
        // right product except self
        int right[] = new int [n];
        right[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1] * arr[i+1];
        }
        // Product
        for (int i=0;i<n;i++){
            left[i] = left[i] * right[i];
        }
        return left;
    }
}
