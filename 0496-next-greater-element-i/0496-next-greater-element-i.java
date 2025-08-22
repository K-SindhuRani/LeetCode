class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
               Stack<Integer> s = new Stack<>();
              if(nums1[i]==nums2[j]){
                for(int k=nums2.length-1;k>j;k--){
                    s.push(nums2[k]);
                }
                while(!s.isEmpty() && s.peek()<=nums2[j]){
                    s.pop();
                }
               ans[i] = s.isEmpty()?-1:s.peek(); 
              }
            }
        }
        return ans;
    }
}