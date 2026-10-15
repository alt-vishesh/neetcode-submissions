class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1, a = 1, b = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                a++;
                b = 1;
            } else if (nums[i] > nums[i + 1]) {
                b++;
                a = 1;
            } else {
                a = 1;
                b = 1;
            }

            max = Math.max(max, Math.max(a, b));
        }

        return max;
    }
}