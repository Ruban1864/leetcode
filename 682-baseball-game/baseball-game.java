class Solution {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length]; // array used as stack
        int top = -1;  // stack pointer

        for (String op : operations) {
            if (op.equals("+")) {
                stack[++top] = stack[top - 1] + stack[top - 2];
            } else if (op.equals("D")) {
                stack[++top] = 2 * stack[top - 1];
            } else if (op.equals("C")) {
                top--; // remove last score
            } else { // it's a number
                stack[++top] = Integer.parseInt(op);
            }
        }

        // calculate total sum
        int sum = 0;
        for (int i = 0; i <= top; i++) {
            sum += stack[i];
        }

        return sum;
    }
}
