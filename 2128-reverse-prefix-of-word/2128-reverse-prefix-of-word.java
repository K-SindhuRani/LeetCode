class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        if(!word.contains(String.valueOf(ch)))
           return word;
        int count = 1;
        for(int i=0;i<word.length();i++){
         sb.append(word.charAt(i));
         if(word.charAt(i)==ch && count ==1){
           sb.reverse();
           count++;
          }
        }
     return sb.toString();
     }
}