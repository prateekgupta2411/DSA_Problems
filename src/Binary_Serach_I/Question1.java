package Binary_Serach_I;
// question : x power k <= N -> where k and N are given you should find the x whicj is less than and equal to N
public class Question1 {
    public static void main(String[] args) {
        int k = 3;
        int N = 87;
        System.out.println(find_X(k,N));
    }
    public static int find_X(int k, int N) {
        int low = 1;
        int high = N;
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Math.pow(mid, k) <= N) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}
