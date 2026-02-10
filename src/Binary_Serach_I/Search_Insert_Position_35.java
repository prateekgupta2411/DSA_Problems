package Binary_Serach_I;

public class Search_Insert_Position_35 {
    public static void main(String[] args){
        int arr[] = {1,2,4,7}, target = 6;
        System.out.println(insertPosition(arr,target));
    }
    public static int insertPosition(int arr[], int target){
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n; // Default to end if target is greater than all elements

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                // Potential answer found, try to go left
                ans = mid;
                high = mid - 1;
            } else {
                // Go right
                low = mid + 1;
            }
        }

        return ans;
    }
}
