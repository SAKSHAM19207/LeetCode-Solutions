class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1||num==0){
            return true;
        }
        int left=1;
        int right=num/2;
        while(left<=right){
            long mid=left+(right-left)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid<num){
                left=(int)mid+1;
            }else{
                right=(int)mid-1;
            }
        }
        return false;
    }
}