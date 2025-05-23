class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String word ="";
        for(int i=0;i<words.length;i++){
          word+=words[i];
          if(word.equals(s))
            return true;
        }
        return false;
    }
}