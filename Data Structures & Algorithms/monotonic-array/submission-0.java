class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean x=true;
        if(nums[0]<=nums[1]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                x=true;
            }
            else{
                x=false;
                break;
            }
        }}
        else{
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                x=true;
            }
            else{
                x=false;
                break;
            }
        }}
        return x;
    }
}