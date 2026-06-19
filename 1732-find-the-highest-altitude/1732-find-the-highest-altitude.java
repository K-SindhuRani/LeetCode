class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int high_alt = 0;

        for(int i=0;i<gain.length;i++){
            sum += gain[i];
            high_alt = Integer.max(sum,high_alt);
        }
        return high_alt;

       /* ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        for(int i=1;i<=gain.length;i++){
            int sum = 0;
            for(int j=0;j<i;j++){
                sum += gain[j];
            }
             list.add(sum);
            
        }
        Collections.sort(list);
     return list.get(list.size()-1);*/
    }
}