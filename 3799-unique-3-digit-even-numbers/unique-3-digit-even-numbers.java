class Solution {
    public int totalNumbers(int[] digits) {
         Set<Integer> set = new HashSet<>();

        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    // Ensure digits are not reused
                    if (i != j && j != k && i != k) {
                        int d1 = digits[i];
                        int d2 = digits[j];
                        int d3 = digits[k];

                        // First digit cannot be zero
                        if (d1 == 0) continue;

                        // Last digit must be even
                        if (d3 % 2 != 0) continue;

                        int num = d1 * 100 + d2 * 10 + d3;
                        set.add(num);
                    }
                }
            }
        }
        return set.size();
    }
}

