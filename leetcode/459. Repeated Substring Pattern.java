public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        int[] lps = computeLPS(s);

        int lengthOfRepeatingSubstring = lps[n - 1];
        return lengthOfRepeatingSubstring > 0 && n % (n - lengthOfRepeatingSubstring) == 0;
    }

    private int[] computeLPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
