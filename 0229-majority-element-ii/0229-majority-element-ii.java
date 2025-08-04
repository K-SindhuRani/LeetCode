class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int a = map.get(nums[i]);
            if(a>nums.length/3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
    }
}