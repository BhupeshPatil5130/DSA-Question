class Solution {
    public boolean canJump(int[] nums) {
        int toReachIdx = nums.length - 1;
        for(int idx = nums.length - 2; idx >= 0; idx--) {
            if(nums[idx] >= toReachIdx-idx) {
                toReachIdx = idx;
            }
        }
        return toReachIdx == 0 ? true : false;
    }
}