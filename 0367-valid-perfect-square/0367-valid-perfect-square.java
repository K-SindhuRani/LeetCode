class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int left = 1;
        int right = num;
        while(left<=right){
            int mid = left+(right-left)/2;
            long val = (long)mid*mid;
            if(val==num){
                return true;
            } else if (val > num){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return false;
    }
}