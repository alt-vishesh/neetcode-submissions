class Solution {
    public String largestGoodInteger(String num) {
        for(char c='9';c>='0';c--)
            if (num.contains(""+c+c+c))
                return ""+c+c+c;
        return "";
    }
}