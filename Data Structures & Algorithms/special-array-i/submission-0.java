class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean x=false;
        if(nums.length==1){
            x=true;
        }
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]%2==0 && nums[i+1]%2==1) || (nums[i]%2==1 && nums[i+1]%2==0))
            {
                x=true;
                continue;
            }
            else{
                x=false;
                break;
            }
            
        }
        return x;
    }
}