class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                for (int j = i - 1; j >= 0; j--) {
                    if (Character.isLetter(sb.charAt(j))) {
                        sb.deleteCharAt(i);
                        sb.deleteCharAt(j);
                        i = -1;
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }
}