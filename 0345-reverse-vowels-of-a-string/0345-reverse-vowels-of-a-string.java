class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Integer> ind = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch=='a' || ch=='A' || ch=='i' || ch=='I' || ch=='e' || ch=='E' ||
        ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            list.add(ch);
            ind.add(i);
        }
       }

       Collections.reverse(list);
       for(int i=0;i<list.size();i++){
        sb.setCharAt(ind.get(i),list.get(i));
       }
       return sb.toString();
    }
}