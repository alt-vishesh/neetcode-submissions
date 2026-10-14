class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length - k + 1];
        int left = 0;
        int right = k - 1;
        int max = nums[0];
        int maxi = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || maxi < left) {
                max = nums[left];
                maxi = left;

                for (int j = left + 1; j <= right; j++) {
                    if (nums[j] > max) {
                        max = nums[j];
                        maxi = j;
                    }
                }
            } else if (nums[right] >= max) {
                max = nums[right];
                maxi = right;
            }

            arr[i] = max;
            left++;
            right++;
        }

        return arr;
    }
}