class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int[] stack = new int[n];
        int[] star = new int[n];
        int top1 = -1, top2 = -1;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack[++top1] = i;
            } else if (ch == '*') {
                star[++top2] = i;
            } else {
                if (top1 != -1) {
                    top1--;
                } else if (top2 != -1) {
                    top2--;
                } else {
                    return false;
                }
            }
        }

        while (top1 != -1 && top2 != -1) {
            if (stack[top1] > star[top2]) {
                return false;
            }
            top1--;
            top2--;
        }

        return top1 == -1;
    }
}
