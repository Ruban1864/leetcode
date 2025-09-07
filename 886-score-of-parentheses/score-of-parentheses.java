class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int[] st = new int[n];
        int x = -1;
        st[++x] = 0;

        for(int i = 0 ; i < n ; i++){
            if( s.charAt(i) == '('){
                st[++x] = 0;
            }else if( s.charAt(i) == ')'){
                int a1 = st[x--];
                int a2 = st[x--];
                int max = a1 * 2;
                if( max == 0 ) max = 1;
                st[++x] = a2 + max ;
            }
        }
    return st[0];
    }
}