class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int maxBeauty = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            while (nums[end] - nums[start] > 2 * k) {
                start++;
            }
            maxBeauty = Math.max(maxBeauty, end - start + 1);
        }

        return maxBeauty;
    }
}