public class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all non-zero elements to the front of the array
        for (int current = 0; current < nums.length; current++) {
            if (nums[current] != 0) {
                // Swap elements at current and lastNonZeroFoundAt
                int temp = nums[lastNonZeroFoundAt];
                nums[lastNonZeroFoundAt] = nums[current];
                nums[current] = temp;
                lastNonZeroFoundAt++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 1 3 12 0 0

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println();  // Output: 0
    }
}
