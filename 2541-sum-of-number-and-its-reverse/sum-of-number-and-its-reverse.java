class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int x = 0 ; x <= num ; x++){
            int rev = 0, temp = x;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            if(x + rev == num){
                return true;
            }
        }
        return false;
    }
}


