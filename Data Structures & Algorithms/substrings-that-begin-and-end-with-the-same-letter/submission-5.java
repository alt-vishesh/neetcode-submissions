class Solution {
    public long numberOfSubstrings(String s) {
        long x = 0;
        x+=s.length();
        int arr[]=new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            x += arr[index];
            arr[index]++;
        }

        return x;
    }
}