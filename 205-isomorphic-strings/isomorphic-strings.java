class Solution {
    public boolean isIsomorphic(String s, String t) {
        return hi(s).equals(hi(t));        
    }
    private String hi(String str) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
             map.putIfAbsent(ch, i);
            sb.append(map.get(ch)).append("-");
         }
    return sb.toString();
    }        
}
