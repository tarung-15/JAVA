package DivideConquer;
public class Solution {

    // Helper function to count occurrences of `num` in range [lo, hi]
    private static int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    // Recursive function to find the majority element in range [lo, hi]
    private static int majorityElementRec(int[] nums, int lo, int hi) {
        // Base case: If the subarray has only one element
        if (lo == hi) {
            return nums[lo];
        }

        // Recurse on left and right halves
        int mid = lo + (hi - lo) / 2;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // If both halves return the same majority element
        if (left == right) {
            return left;
        }

        // Otherwise, count each and return the one with higher frequency
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    // Main function to call
    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    // Driver Code
    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));  // Output: 2
    }
}
