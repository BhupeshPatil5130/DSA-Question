class Solution {
    public int strStr(String haystack, String needle) {
          int l = haystack.length(), n = needle.length();
        for (int i = 0; i <= l - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}