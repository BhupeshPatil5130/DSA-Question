class Solution {
    public int maxProduct(int[] nums) {
         int n = nums.length;
        int maxP = nums[0], curMax = nums[0], curMin = nums[0];

        for (int i = 1; i < n; i++) {
            int temp = curMax;
            curMax = Math.max(nums[i], Math.max(curMax * nums[i], curMin * nums[i]));
            curMin = Math.min(nums[i], Math.min(temp * nums[i], curMin * nums[i]));
            maxP = Math.max(maxP, curMax);
        }
        return maxP;
    }
}