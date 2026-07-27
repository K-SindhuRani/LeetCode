class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i : map.keySet()){
            if( i%2 == 0)
              list.add(i);
        }

        Collections.sort(list, (a,b) -> {
            if(map.get(a).equals(map.get(b))){
                return a - b;
            }
            return map.get(b) - map.get(a);
         });
        
        if(list.size()==0)
           return -1;
        
         return list.get(0);


    }
}