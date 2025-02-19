class Solution {
    public boolean isHappy(int n) {

        Set<Integer> s = new HashSet<>();

        while(!s.contains(n)){
            s.add(n);
            int sum =0;
            while(n != 0){
                int tmp = n%10;
                sum += tmp*tmp;
                n = n/10;
            }
            n = sum;
        }
        return n==1;
        
    }
}