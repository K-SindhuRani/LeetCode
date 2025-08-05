class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count = 0;
        boolean hasOdd = false;
        for(int j:map.values()){
                if(j%2==0)
                    count+=j;
                else{
                  count+= j-1;
                  hasOdd = true;
            }
        }
         return hasOdd ? count+1 : count;
    }
}