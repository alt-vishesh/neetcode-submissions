class Solution {
    public int lengthOfLastWord(String s) {
        int a=0;
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                a+=0;
                break;
            }
            else{
                a++;
            }
        }
        char[] arr=new char[a];
        for(int j=0;j<a;j++){
            arr[j]=s.charAt(j);
        }
        return arr.length;
    }
}