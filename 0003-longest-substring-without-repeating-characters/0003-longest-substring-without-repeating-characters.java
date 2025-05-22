class Solution {
    public int lengthOfLongestSubstring(String s) {
     int max=0;
       for(int i=0;i<s.length();i++){
        HashSet<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int j=i;j<s.length();j++){
         char c = s.charAt(j);
         if(hs.contains(c)){
            break;
         }
         hs.add(c);
         sb.append(c);
         if(sb.length()>max){
            max=sb.length();
         }
        }
     }
     return max;
    }
}