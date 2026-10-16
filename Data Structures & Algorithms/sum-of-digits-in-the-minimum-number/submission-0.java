class Solution {
    public int sumOfDigits(int[] nums) {
        int x=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<x){
                x=nums[i];
            }
        }
        String y=String.valueOf(x);
        int sum=0;
        for(int i=0;i<y.length();i++){
            sum=sum+( Character.getNumericValue(y.charAt(i)));
        }
        if(sum%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
