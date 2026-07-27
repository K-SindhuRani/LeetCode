class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        ArrayList<Character> list = new ArrayList<>();
        for(char c : map.keySet()){
            list.add(c);
        }

        Collections.sort( list , (a,b) -> map.get(b)-map.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c : list){
            int freq = map.get(c);

            for(int i=0;i<freq;i++){
             sb.append(c);
            }
        }

        return sb.toString();
     
    }
}