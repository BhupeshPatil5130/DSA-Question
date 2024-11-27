class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            int key=prices[i];
            int j=i+1;
            while(j<n){
                if(prices[j]<=key){
                    key=key-prices[j];
                    break;
                }
                j++;
            }
            ans[i]=key;
        }
        return ans;
    }
}