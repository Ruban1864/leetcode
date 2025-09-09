class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // first row

        for (int i = 1; i <= rowIndex; i++) {
            // add dummy element at end
            row.add(0);

            // update in reverse
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}