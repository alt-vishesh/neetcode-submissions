class Solution {
    public int countSeniors(String[] details) {
        int c = 0;

        for (String m : details) {
            String ageStr = "" + m.charAt(11) + m.charAt(12);
            int age = Integer.parseInt(ageStr);
            if (age > 60) {
                c++;
            }
        }
        return c;
    }
}
