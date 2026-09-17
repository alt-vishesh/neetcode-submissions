class Solution {
    public boolean isValid(String s) {
        // Jab tak string me valid pairs hain, unhe replace karte jao
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        // Agar sab remove ho gaya → valid
        return s.isEmpty();
    }
}