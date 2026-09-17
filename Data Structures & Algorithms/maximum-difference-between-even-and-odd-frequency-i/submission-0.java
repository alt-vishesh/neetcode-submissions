class Solution {
    public int maxDifference(String s) {
        int[] f=new int[26];
        for (int i=0;i<s.length();i++) {
            char ch=s.charAt(i);
            int index=ch-'a';
            f[index]++;
        }
        int o=0;
        int e=Integer.MAX_VALUE;
        for (int i=0; i<26;i++) {
            if (f[i]>0 && f[i]%2!=0) {
                if (f[i]>o) {
                    o = f[i];
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if (f[i] > 0 && f[i] % 2 == 0) {
                if (f[i] < e) {
                    e = f[i];
                }
            }
        }
        
        return o-e;
    }
}