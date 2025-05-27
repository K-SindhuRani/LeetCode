public class Solution {
    public int[] twoSum(int[] numbers, int target) {    
        int arr[] = new int[2];
        //brute force method
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
    }
}