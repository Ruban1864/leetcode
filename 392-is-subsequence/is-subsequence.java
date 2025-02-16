class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] S =s.toCharArray();
        char[] T =t.toCharArray();
        int count=0;
        int i=0;

        for( int j = 0 ; j < T.length ; j++){
            if ( i< S.length && S[i] == T[j] ){
                count++;
                i++;
            }
        }
        return S.length == count;
    }
}