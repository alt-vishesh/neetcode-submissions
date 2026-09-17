class Solution {
    public int countSeniors(String[] details) {
        int c = 0;

        for (String m : details) {
            // Directly substring le lo (index 11 aur 12)
            int age = Integer.parseInt(m.substring(11, 13));

            if (age > 60) {
                c++;
            }
        }
        return c;
    }
}
