class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int result = 0;
        int i, j;
        char ch[] = s.toCharArray();

        for (i = 0, j = 1; j < ch.length; i++, j++) {
            if (m.get(ch[i]) >= m.get(ch[j])) {
                result += m.get(ch[i]);  
            } else {
                result -= m.get(ch[i]);  
            }
        }
        result += m.get(ch[i]);  

        return result;
    }
}
