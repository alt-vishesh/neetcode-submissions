class Solution {
    public int specialArray(int[] nums) {
        int x=nums[0];
        for(int i=1;i<nums.length;i++){
            if(x<nums[i]){
                x=nums[i];
            }
        }
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int r=0;
        for(int i=1;i<=nums.length;i++){
            int m=0;
            
                for(int j=0;j<nums.length;j++){
                    if(i<=nums[j]){
                        m++;
                    }
                }
                if(m==i){
                    return i;
                }
                
            
            
            
        }
        if(r>0){
            return r;
        }
        return -1;
    }
}