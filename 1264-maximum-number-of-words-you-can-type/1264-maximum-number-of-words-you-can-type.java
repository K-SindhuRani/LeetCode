class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new LinkedHashSet<>();
        String[] words = text.split("\\s+");
        for(char c : brokenLetters.toCharArray()){
            set.add(c);
        }
        int res = 0;
        for(String s : words){
            boolean cantype = true;
            for(char c:s.toCharArray()){
                if(set.contains(c)){
                    cantype = false;
                    break;
                }
            }
            if(cantype) 
              res++;
        }
        return res;
    }
}