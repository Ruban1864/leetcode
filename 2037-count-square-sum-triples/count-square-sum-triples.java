class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int a = 1 ; a <= n ; a++ ){
            for(int b = a+1 ; b <= n ; b++){
                int s = (a*a) + (b*b);
                int sq = (int) Math.sqrt(s);
                if(sq <= n && s == sq * sq ){
                    count+=2;
                }
            }
        }
        return count;
    }
}