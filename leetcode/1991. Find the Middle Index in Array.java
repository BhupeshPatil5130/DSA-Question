class Solution {
    public int findMiddleIndex(int[] nums) {
         int sum = 0;
        int leftSide = 0;
        for(int a: nums) sum += a;
        for(int a = 0; a < nums.length; a++){
            if(leftSide == (sum-(leftSide+nums[a]))) return a;
            leftSide += nums[a];
        }
        return -1;
    }
}