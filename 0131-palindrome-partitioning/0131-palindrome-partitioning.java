class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
       int partitions = (int)Math.pow(2,s.length()-1);
       for(int i=0;i<partitions;i++){
        List<String> p = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int j=0;j<s.length();j++){
            sb.append(s.charAt(j));

            boolean cutHere = false;
            if((i & (int) Math.pow(2,j))!=0 || j==s.length()-1){
                cutHere = true;
            }
            if(cutHere){
                p.add(sb.toString());
                sb.setLength(0);
            }
        }
        if(allpalindromes(p)){
            list.add(p);
        }
        }
        return list;
       }

       public boolean allpalindromes(List<String> l){
        for(String str : l){
            if(!ispalindrome(str))
              return false;
        }
        return true;
       }

       public boolean ispalindrome(String str){
        int l = 0;
        int r = str.length()-1;
        while(l < r){
            if(str.charAt(l++)!=str.charAt(r--)){
               return false;
            }
        }
        return true;
       }
    }
