class Solution {
    public long maximumSumScore(int[] nums) {
        long max=Integer.MIN_VALUE;
        long ls=nums[0];
        long rs=0;
        for(int j=0;j<nums.length;j++){
                rs+=nums[j];
        }
        long x;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                x=Math.max(ls,rs);
            }
            else{
                ls+=nums[i];
                rs-=nums[i-1];
                x=Math.max(ls,rs);
            }
            max=Math.max(max,x);
        }
        return max;
    }
}
