class Solution {
    public int countElements(int[] arr) {
        int x=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]+1){
                    x+=1;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return x;
    }
}
