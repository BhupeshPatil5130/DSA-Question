class Solution {
    public int pivotInteger(int n) {
         double s = Math.sqrt((n*n+n)/2);
        if(Math.floor(s)==Math.ceil(s)){
            return (int)Math.floor(s);
        }
        return -1;
    }
}