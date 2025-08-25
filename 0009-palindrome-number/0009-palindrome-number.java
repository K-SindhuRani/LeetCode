class Solution {
    public static boolean isPalindrome(int x) {
      /*  int r=0;
        int sum=0;
        int temp;
        temp=x;
        while(x>0)
        {
         r = x%10;
        sum=(sum*10)+r;
        x=x/10; 
        }
        if(sum==temp){
            return true;
        }
        else
        {
            return false;
        }
    }
 public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(isPalindrome(x));*/
        if(x<0){
            return false;
        }
        int res = 0;
        int temp = x;
        while(temp!=0){
            int r = temp%10;
            res = res*10 + r;
            temp = temp/10;
        }
        if(res==x){
            return true;
        }
        return false;
    } 
}