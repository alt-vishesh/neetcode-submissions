class Solution {
    public int countSeniors(String[] details) {
        String a="";
        String b="";
        int c=0;
        String s="";
        for(String m: details){
            for(int i=0;i<m.length();i++){
                if(i==11){
                    a=String.valueOf(m.charAt(i));
                }
                else if(i==12){
                    b=String.valueOf(m.charAt(i));
                    
                }
                s=a+b;
            }
            if(Integer.parseInt(s)>60){
                c++;
            }
        }
        return c;
    }
}