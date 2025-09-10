class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            if(ishelper(i))
                res.add(i);            
        }
        return res;
    }
    private boolean ishelper(int n){
        int temp = n;
        while( temp > 0){
            int digit = temp % 10;
            if( digit == 0 || n % digit != 0)
                return false;
            temp /= 10;
        }
        return true;
    }
}