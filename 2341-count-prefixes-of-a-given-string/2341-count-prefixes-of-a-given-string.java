class Solution {
    public int countPrefixes(String[] words, String s) {
     int wordCount = 0;
     for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= s.length()) {
                if (s.substring(0, word.length()).equals(word)) {
                    wordCount++;
                }
            }
        }
      return wordCount;
    }
}
