class Solution {
    public int lengthOfLongestSubstring(String s) {
        int x=0;
        int left=0;
        int right=0;
        HashSet<Character> set = new HashSet<>();
        while(right<s.length()){
            
            if(set.contains(s.charAt(right))){
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    // set.add(s.charAt(right));

                    left=left+1;
                }
                set.add(s.charAt(right));
            }
            else{
                set.add(s.charAt(right));
                
            }
            
            x=Math.max(x,right-left+1);
            right=right+1;
        }
        
        return x;
    }
}
