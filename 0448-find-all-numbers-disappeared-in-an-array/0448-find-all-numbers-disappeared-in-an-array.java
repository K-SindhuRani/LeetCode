class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

      /*  List <Integer> list = new ArrayList<>();
        List <Integer> list1 = new ArrayList<>();
         for(int i : nums){
            list1.add(i);
         }
        for(int i=1;i <= list1.size();i++){
            if(!list1.contains(i))
                list.add(i);
        }
       return list;*/
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; 
            if (nums[index] > 0) {
                nums[index] = -nums[index];   
        }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {   
                result.add(i + 1);
            }
        }

        return result;
    }
}
