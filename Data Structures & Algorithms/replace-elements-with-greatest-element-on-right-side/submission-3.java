class Solution {
    public int[] replaceElements(int[] arr) {
    int[] a=new int[arr.length];
    int max=Integer.MIN_VALUE;
    for(int i=arr.length-1;i>0;i--){
        if(max<arr[i]){
            max=arr[i];
        }
        a[i-1]=max;
    }
    a[a.length-1]=-1;
    return a;
    }
                
}