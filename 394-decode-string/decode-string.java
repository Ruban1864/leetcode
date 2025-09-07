import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String r = "";
        int m = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                m = m * 10 + (ch - '0');  // build number
            } else if (ch == '[') {
                numStack.push(m);
                strStack.push(r);
                m = 0;
                r = "";
            } else if (Character.isLetter(ch)) {
                r += ch;
            } else if (ch == ']') {
                int k = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int j = 0; j < k; j++) {
                    temp.append(r);
                }
                r = temp.toString();
            }
        }
        return r;
    }
}
