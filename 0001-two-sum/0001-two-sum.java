public class Solution {
    public int[] twoSum(int[] numbers, int target) { 
        /*brute force method   
        int arr[] = new int[2];
        for(int i=0;i< numbers.length-1;i++){
        for(int j=i+1;j< numbers.length;j++){
            int sum = numbers[i]+numbers[j];
                if(sum==target){
                    arr[0]=i;
                    arr[1]=j;
                }
        }
        }
        return arr;
        */
    //optimal Approach
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<numbers.length;i++){
        int complement = target-numbers[i];
     if(map.containsKey(complement)){
        return new int[] {map.get(complement),i};
     }
    map.put(numbers[i],i);
    }
    return new int[] {-1,-1};
    }
}