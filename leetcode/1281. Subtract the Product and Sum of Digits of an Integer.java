class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1,ans;
        while(n>0){
            ans=n%10;
            sum+=ans;
            mul *=ans;
            n=n/10;

        }
        return mul-sum;
    }
}