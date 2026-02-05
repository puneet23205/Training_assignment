class Solution {

    // Generate single row
    private List<Integer> generateRow(int row) {

        List<Integer> rowList = new ArrayList<>();

        long ans = 1;

        rowList.add(1); // first element

        for (int col = 1; col < row; col++) {

            ans = ans * (row - col);
            ans = ans / col;

            rowList.add((int) ans);
        }

        return rowList;
    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {

            result.add(generateRow(i));
        }

        return result;
    }
}
