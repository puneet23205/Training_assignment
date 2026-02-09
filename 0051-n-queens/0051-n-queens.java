import java.util.*;

class Solution {

    // Backtracking function
    private void solve(int col, char[][] board, List<List<String>> ans,
                       int[] leftRow, int[] upperDiagonal,
                       int[] lowerDiagonal, int n) {

        // Base case: all queens placed
        if (col == n) {
            ans.add(construct(board));
            return;
        }

        // Try placing queen in each row
        for (int row = 0; row < n; row++) {

            // Check if safe
            if (leftRow[row] == 0 &&
                lowerDiagonal[row + col] == 0 &&
                upperDiagonal[n - 1 + col - row] == 0) {

                // Place Queen
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;

                // Recurse
                solve(col + 1, board, ans,
                      leftRow, upperDiagonal, lowerDiagonal, n);

                // Backtrack
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }

    // Convert board to List<String>
    private List<String> construct(char[][] board) {

        List<String> res = new ArrayList<>();

        for (char[] row : board) {
            res.add(new String(row));
        }

        return res;
    }

    // Main Function
    public List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();

        // Board
        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Arrays for checking safety
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];

        // Start recursion
        solve(0, board, ans,
              leftRow, upperDiagonal, lowerDiagonal, n);

        return ans;
    }
}
