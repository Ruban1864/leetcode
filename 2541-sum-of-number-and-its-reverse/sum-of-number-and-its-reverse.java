class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int x = 0 ; x <= num ; x++){
            int rev = reverse(x);
            if(x + rev == num){
                return true;
            }
        }
        return false;
    }
    private int reverse(int num ){
        int rev = 0;
        while( num > 0){
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}