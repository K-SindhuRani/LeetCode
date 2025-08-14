class Solution {
    public void moveZeroes(int[] nums) {
        /*ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i :nums){
            if(i==0)
                count++;
            else {list.add(i);}
        }
        int ind = 0;
       for(int i=0;i<list.size()-count;i++){
        nums[ind++] = list.get(i);
       }
       for(int i=0;i<count;i++){
        nums[ind++] = 0;
       }*/
       int ind  = 0;
       int count = 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){count++;}
        else {
            nums[ind++] = nums[i];
        }
       }
       for(int i=0;i<count;i++){
        nums[ind++] = 0;
       }
    }
}