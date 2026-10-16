class Solution {
    public String removeVowels(String s) {
        String x="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u'){
                x=x+s.charAt(i);
            }
        }
        return x;
    }
}
