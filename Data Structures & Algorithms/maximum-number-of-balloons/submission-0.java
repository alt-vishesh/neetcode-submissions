class Solution {
    public int maxNumberOfBalloons(String text) {
        int oc=0;
        int bc=0;
        int ac=0;
        int nc=0;
        int lc=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b'){
                bc++;
            }
            else if(text.charAt(i)=='a'){
                ac++;
            }
            else if(text.charAt(i)=='l'){
                lc++;
            }
            else if(text.charAt(i)=='o'){
                oc++;
            }
            else if(text.charAt(i)=='n'){
                nc++;
            }
        }
        int or=oc/2;
        int br=bc;
        int ar=ac;
        int lr=lc/2;
        int nr=nc;
        int f=0;

        for(int i=0;i<text.length();i++){
            if(or>0 && br>0 && ar>0 && lr>0 && nr>0){
            f++;
            or--;
            br--;
            ar--;
            lr--;
            nr--;
            }
        }
        return f;
    }
}