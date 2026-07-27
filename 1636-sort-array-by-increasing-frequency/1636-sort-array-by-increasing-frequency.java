class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : map.keySet()){
            list.add(i);
        }

        Collections.sort(list, (a,b) ->{
            if(map.get(a).equals(map.get(b))){
                return b-a;
            }
            return map.get(a) - map.get(b);
        });
        
        int res[] = new int[nums.length];
        int idx = 0;
        for(int i : list){
            int freq = map.get(i);
         for(int j=0;j<freq;j++){
           res[idx++] = i;
         }
        }

        return res;
    }
}