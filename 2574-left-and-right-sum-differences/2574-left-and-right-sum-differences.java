class Solution {
    public int[] leftRightDifference(int[] nums) {
        int arr[] = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int leftSum = 0;
            for(int j=0;j<i;j++){
                leftSum += nums[j];
            }

            int rightSum = 0;
            for(int j=i+1;j<nums.length;j++){
                rightSum += nums[j];
            }
         arr[i] = Math.abs(leftSum - rightSum);
        }
        return arr;
    }
}