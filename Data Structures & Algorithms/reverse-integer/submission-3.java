class Solution {
    public int reverse(int x) {
        boolean b=false;
        String s=String.valueOf(x);
        String l="";
        char f='-';
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='-'){
                b=true;
            }
            else{
                l+=s.charAt(i);
            }
        }
        
        if(b==true){
            l=f+l;
        }
        long a=Long.parseLong(l);
        if(a>(-(Math.pow(2,31))) && a<((Math.pow(2,31))-1)){
            return (int)a;
        }
        else{
            return 0;
        }
    }
}
