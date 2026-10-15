class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int a=1;
        int b=1;
        int f=0;
        int x=1;
        int y=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                a++;
                x=a;
                x=Math.max(x,b);
                b=1;
            }
            else if(nums[i]>nums[i+1]){
                b++;
                y=b;
                y=Math.max(y,a);
                a=1;
            }
            else{
                x=Math.max(x,b);
                y=Math.max(y,a);
                a=1;
                b=1;
            }
            f=Math.max(x,y);
            max=Math.max(max,f);

        }
        
        return max;
    }
}