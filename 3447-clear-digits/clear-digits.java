class Solution {
    public String clearDigits(String s) {
         StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Remove closest left non-digit if available
                if (stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
                // Do not add the digit itself
            } else {
                stack.append(ch); // Add non-digit
            }
        }

        return stack.toString();
    }
}