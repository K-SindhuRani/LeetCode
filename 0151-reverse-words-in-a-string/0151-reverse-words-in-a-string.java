class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] arr= s.split("\\s+");
        String rev=" ";
        for(int i=arr.length-1;i>=0;i--){
         rev+=arr[i]+" ";
         }  
         rev = rev.trim();
        return rev;
    }
}