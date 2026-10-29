class Solution {
    public boolean isConsecutive(int[] nums) {
        int n = nums.length;

        for (int size = 1; size < n; size *= 2) {
            for (int left = 0; left < n - size; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);

                int[] temp = new int[right - left + 1];

                int i = left;
                int j = mid + 1;
                int k = 0;

                while (i <= mid && j <= right) {
                    if (nums[i] <= nums[j]) {
                        temp[k++] = nums[i++];
                    } else {
                        temp[k++] = nums[j++];
                    }
                }

                while (i <= mid) {
                    temp[k++] = nums[i++];
                }

                while (j <= right) {
                    temp[k++] = nums[j++];
                }

                for (int x = 0; x < temp.length; x++) {
                    nums[left + x] = temp[x];
                }
            }
        }
        if(nums.length==2){
            return false;
        }
        boolean x=true;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]-1 && nums[i]!=nums[i+1]){
                x=true;
            }
            else if(nums[i]!=nums[i+1]-1 || nums[i]==nums[i+1]){
                x=false;
                break;
            }
        }
        return x;
    }
}
