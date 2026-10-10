class Solution {
    public int maxScore(String s) {
        int f=0;
        for(int i=0;i<s.length()-1;i++){
            String a=s.substring(0,i+1);
            String b=s.substring(i+1,s.length());
            char[] arr1=a.toCharArray();
            char[] arr2=b.toCharArray();
            int x=0;
            int y=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]=='0'){
                    x++;
                }
            }
            for(int j=0;j<arr2.length;j++){
                if(arr2[j]=='1'){
                    y++;
                }
            }
            if((x+y)>f){
                f=x+y;
            }
        }
        return f;
    }
}