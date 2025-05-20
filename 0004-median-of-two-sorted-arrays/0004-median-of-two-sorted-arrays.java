class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int l1=nums1.length;
    int l2 = nums2.length;
    int l3 =l1+l2;
    int merged[] = new int[l3];
    System.arraycopy(nums1,0,merged,0,l1);
    System.arraycopy(nums2,0,merged,l1,l2);
    Arrays.sort(merged);
    if(l3%2!=0){
        double d = merged[l3/2];
        return d;
    }
    else
    {
        return (merged[(l3-1)/2] + merged[(l3/2)])/2.0;
    
    }
}
}