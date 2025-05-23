class Solution {
    public int maxSubArray(int[] nums) {
        int cSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            cSum = Math.max(cSum+nums[i],nums[i]);
            maxSum = Math.max(maxSum,cSum);
        }
        return maxSum;
    }
}