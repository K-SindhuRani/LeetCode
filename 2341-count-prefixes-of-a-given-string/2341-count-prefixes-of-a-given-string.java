class Solution {
    public int countPrefixes(String[] words, String s) {
        int word = 0;
        for(int i=0;i<words.length;i++){
          for(int j=0;j<=s.length();j++){
           if(words[i].equals(s.substring(0,j)))
              word++;
             }
        }
    return word;
    }
}