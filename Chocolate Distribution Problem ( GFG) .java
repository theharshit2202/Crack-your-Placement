import java.util.Arrays;

public class ChocolateDistribution {
    public static int findMinDiff(int[] arr, int n, int m) {
        // If there are no chocolates or students
        if (m == 0 || n == 0) {
            return 0;
        }

        // Sort the given packets
        Arrays.sort(arr);

        // Number of students cannot be more than number of packets
        if (n < m) {
            return -1;
        }

        // Find the minimum difference
        int minDiff = Integer.MAX_VALUE;

        // Find the subarray of size m with the minimum difference
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7; // Number of students
        int n = arr.length;
        System.out.println("Minimum difference is " + findMinDiff(arr, n, m));
    }
}