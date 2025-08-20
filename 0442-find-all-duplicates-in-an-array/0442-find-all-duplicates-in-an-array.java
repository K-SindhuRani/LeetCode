class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      //  ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        /*for( int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
               result.add(nums[i]);
            }
            list.add(nums[i]);
        }
        return result;*/
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length-1){
            if(nums[i]==nums[i+1]){
              result.add(nums[i]);
              i = i+2;
            }
            else {
                i = i+1;
            }
        }
        return result;
    }
}