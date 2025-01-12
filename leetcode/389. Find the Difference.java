class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0; // Variable to store the result
        
        for (char c : s.toCharArray()) {
            res ^= c;
        }
        
        for (char c : t.toCharArray()) {
            res ^= c;
        }
         return res; 
    }
}