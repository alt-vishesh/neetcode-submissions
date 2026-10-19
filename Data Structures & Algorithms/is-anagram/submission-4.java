class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        s=new String(arr);
        char[] arr1=t.toCharArray();
        Arrays.sort(arr1);
        t=new String(arr1);
        return s.equals(t);
    }
}