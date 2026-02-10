package Binary_Serach_I;
//What is lower bound?
//The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
//The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
public class Lower_Bound {
    public static void main(String[] args) {
        int arr[] = {3,5,8,15,19};
        int x = 9;
        System.out.println(lowerBound(arr,x));
    }
    public static int lowerBound(int arr[], int x){
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] >= x){
                ans = mid;
                end = mid -1; // search left
            } else {
                start = mid+1;
            }
        }
        return ans;
    }
}
