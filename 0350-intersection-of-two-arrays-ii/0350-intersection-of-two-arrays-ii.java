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
        /*for(int i=0;i<=nums1.length-1;i++){
            if(!arr.contains(nums1[i])){
                arr.add(nums1[i]);
            }
         }
         ArrayList<Integer> arr1 = new ArrayList<Integer>();
          for(int i=0;i<=nums2.length-1;i++){
            if(arr.contains(nums2[i]) && !arr1.contains(nums2[i])){
                arr1.add(nums2[i]);
            }
        }
        int[] result = new int[arr1.size()];
        int index = 0;
        for(int i:result){
            result[index++]=i;
        }
       HashMap<Integer,Integer> map1 = new HashMap<>();
       HashMap<Integer,Integer> map2 = new HashMap<>();
       for(int i=0;i<nums1.length;i++){
        map1.put(nums1[i],map1.getOrDefault(nums1[i],0)+1);
       }
         for(int i=0;i<nums2.length;i++){
        map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
       }
        for(int key : map1.keySet()){
            if(map2.containsKey(key)){
                if(map1.get(key).equals(map2.get(key))){
                    for(int i=0;i<map1.get(key);i++){
                        list.add(key);
                    }
                }
            }
        }
       /* for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }
        }
          int[] result = new int[list.size()];
          for(int i=0;i<result.length;i++){
            result[i]= list.get(i);
          }
        return result;*/
    }
}