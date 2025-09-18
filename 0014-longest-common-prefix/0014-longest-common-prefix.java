class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return " ";
        }
      /*  for(int i=0;i<strs[0].length();++i){
            for(int j=1;j<strs.length;++j){
                if(i==strs[j].length() || strs[j].charAt(i)!=strs[0].charAt(i))
                  return strs[0].substring(0,i);                
        }
    }
    return strs[0];*/
    int size = strs[0].length();
    for(int i=0;i<strs.length-1;i++){
        String s1 = strs[i];
        String s2 = strs[i+1];
        int count = 0;

        for(int j=0;j<Math.min(s1.length(),s2.length());j++){
            if(s1.charAt(j)==s2.charAt(j))
               count++;
            else 
               break;
        }
        size = Math.min(size,count);
    }
    String res = "";
    if(size==0){
        return res;
    }
    for(int i=0;i<size;i++){
        res+=strs[0].charAt(i);
    }
    return res;
}
}