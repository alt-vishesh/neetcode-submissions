class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int maxlen=0;
        int l=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
        
            while(z>1){
                if(nums[l]==0){
                    z--;
                    l++;
                }
                else{
                    l++;
                }
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        if(z==0){
            return nums.length;
        }
        return maxlen;
    }
}
