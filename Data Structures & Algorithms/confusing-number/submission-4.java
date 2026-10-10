class Solution {
    public boolean confusingNumber(int n) {
        int n1=n;
        String s1=Integer.toString(n);
        StringBuilder s2=new StringBuilder(Integer.toString(n1));
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)=='0'){
                s2.setCharAt(i,'0');
            }
            else if(s2.charAt(i)=='1'){
                s2.setCharAt(i,'1');
            }
            else if(s2.charAt(i)=='6'){
                s2.setCharAt(i,'9');
            }
            else if(s2.charAt(i)=='8'){
                s2.setCharAt(i,'8');
            }
            else if(s2.charAt(i)=='9'){
                s2.setCharAt(i,'6');
            }
            else{
                return false;
            }

        }
        if(Integer.valueOf(s1)==Integer.valueOf(s2.toString())){
            return false;
        }
        else{
            return true;
        }
    }
}
