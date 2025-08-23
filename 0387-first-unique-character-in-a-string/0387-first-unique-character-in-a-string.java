class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> map = new LinkedHashMap<>();
       StringBuilder sb = new StringBuilder(s);
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0) + 1 );
       }
       char res =' ';
        for( char c: map.keySet()){
            if(map.get(c)==1){
                 res = c;
                 break;
            }
        }
        for(int i=0;i<s.length();i++){
            if(res==s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}