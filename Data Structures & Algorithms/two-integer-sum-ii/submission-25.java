class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] arr=new int[2];
        int x=0;
        int y=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            if(x<y){
            if(numbers[x]+numbers[y]<target){
                x++;
            }
            else if(numbers[x]+numbers[y]>target){
                y--;
            }
            else{
                break;
            }
            }
        }
        arr[0]=x+1;
        arr[1]=y+1;
        return arr;
    }
}