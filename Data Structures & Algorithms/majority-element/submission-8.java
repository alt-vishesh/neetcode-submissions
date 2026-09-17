class Solution {
    public int majorityElement(int[] nums) {
        int y=Integer.MIN_VALUE;
        int z=0;
        for(int i=0;i<nums.length;i++){
            int f=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    f++;
                }
            }
            if(f>=y && f>((nums.length-1)/2)){
                y=f;
                z=nums[i];
            }
        }
        return z; 
    }
}