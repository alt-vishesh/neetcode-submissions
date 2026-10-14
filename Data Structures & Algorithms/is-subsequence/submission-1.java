class Solution {
    public boolean isSubsequence(String s, String t) {
        String f="";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    f=f+t.charAt(j);
                    t = t.substring(j + 1);
                    break;
                }
            }
        }
        
        if(f.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}