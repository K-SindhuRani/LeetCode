class Solution {
    public boolean isIsomorphic(String s, String t) {
      HashMap<Character,Character> map1 = new HashMap<>();
      HashMap<Character,Character> map2 = new HashMap<>();

      if(s.length()!=t.length())
         return false;
    for(int i=0;i<s.length();i++){
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
        if(map1.containsKey(c1)){
            char c = map1.get(c1);
            if(c!=c2)
                return false;
        }
        map1.put(c1,c2);

        if(map2.containsKey(c2)){
            char c = map2.get(c2);
            if(c1!=c)
              return false;
        }
        map2.put(c2,c1);
      }
      return true;
    }
}