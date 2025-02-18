class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();       
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for (int i = 0; i < len; i++) {
            if (map1[sc[i]] != map2[tc[i]]) return false;
            map1[sc[i]] = i + 1;
            map2[tc[i]] = i + 1;
        }
        return true;
    }
}
