class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = s.length();
        if( words.size() != n ) return false;
        
        for(int i = 0 ; i < n ; i++){
            String newS = words.get(i);
            if( newS.charAt(0) != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
}