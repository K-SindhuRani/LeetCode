class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        String words[] = s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
       /* for(Integer i=0;i<pattern.length();i++){
            if(map1.put(pattern.charAt(i),i)!=map2.put(words[i],i))
              return false;
        }
        return true;*/

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String str = words[i];
            if(map1.containsKey(c)){
               String temp = map1.get(c);
               if(!temp.equals(str))
                   return false;
            }
            map1.put(c,str);
        }
       for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String str = words[i];
            if(map2.containsKey(str)){
                char temp = map2.get(str);
                if(c!=temp)
                   return false;
            }
            map2.put(str,c);
        }
        return true;
    }
}