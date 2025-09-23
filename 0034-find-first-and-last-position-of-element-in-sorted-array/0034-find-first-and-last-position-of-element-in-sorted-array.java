class Solution {
    public int[] searchRange(int[] nums, int target) {
    int arr[] = new int[2];
    int c1 = 0;int c2=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
           arr[0]=i;
           c1++;
           break;
        }
    }
    for(int i=arr[0];i<nums.length;i++){
        if(nums[i]==target){
            arr[1]=i;
            c2++;
        }
     }
     if(c1==0 && c2==0){
        arr[0] = -1;
        arr[1] = -1;
     }
     return arr;
    }
}