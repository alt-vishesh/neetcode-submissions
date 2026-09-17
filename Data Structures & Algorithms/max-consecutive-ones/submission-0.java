class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int f=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                f=f+1;
                
            }
            else{
                f=0;
                continue;
            }
            if (f>max){
                max=f;
            }
        }
        return max;
    }
}