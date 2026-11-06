class Solution {
    public int twoSumLessThanK(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            int x=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]<k){
                if(x<nums[i]+nums[j]){
                    x=nums[i]+nums[j];
                }}
            }
            if(x<k && x>max){
                max=x;
            }
        }
        if(max==0){
            return -1;
        }
        return max;
    }
}
