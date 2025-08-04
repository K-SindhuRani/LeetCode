class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
              int val = map.get(nums[i]);
              if(Math.abs(val-i)<=k)
                  return true;
            }
            map.put(nums[i],i);
         }
        return false;
     /*  for(int i=0;i<nums.length-1;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                int val = Math.abs(i-j);
                if(val<=k){
                    return true;
                }
            }
        }
       }
       return false;*/
       }
    }

