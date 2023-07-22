package com.programmingsquirrel.threestepreversal;

public class ThreeStepReversal {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 9;

        rotateLeft(nums, k);
    }

    public static void rotateLeft(int[] nums, int k) {
        int n = nums.length;

        k = k % n; // This operation is to avoid doing extra movements.

        // Step 1: Invert the array
        reverse(nums, 0, n - 1);
        // Step 2: Invert the first elements
        reverse(nums, 0, k - 1);
        // Step 3: Invert the last elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {

        /* The idea is to reverse the values that indicate from the start and end,
         * in other words switch the first element (start) with the final element (end)
         */
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
