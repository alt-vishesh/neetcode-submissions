class Solution {
    public int removeElement(int[] nums, int val) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]==val){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int count=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=val){
                count++;
            }
        }
        return count;
    }
}