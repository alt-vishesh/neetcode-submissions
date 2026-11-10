class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int f=0;
        for(int i=0;i<nums.length-2;i++){
            int x=i+1;
            int y=nums.length-1;
            while(x<y){
                int sum=nums[i]+nums[x]+nums[y];
                if(sum<target){
                    f+=(y-x);
                    x++;
                    
                }
               
                else{
                    y--;
                    continue;
                }
            }
        }
        return f;
    }
}