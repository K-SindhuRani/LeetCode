class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            list1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(list1.contains(nums2[i])){
                list.add(nums2[i]);
                list1.remove((Integer)nums2[i]);
            }
        }
        int arr[] = new int[list.size()];
        int ind = 0;
        for(int i=0;i<list.size();i++){
            arr[ind++] = list.get(i);
        }
        return arr;
    }
}