class Solution {

    boolean isSafe(List<String> board, int row, int col, int n) {

        for (int j = 0; j < n; j++) {
            if (board.get(row).charAt(j) == 'Q')
                return false;
        }

        for (int i = 0; i < n; i++) {
            if (board.get(i).charAt(col) == 'Q')
                return false;
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }

        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board.get(i).charAt(j) == 'Q')
                return false;
        }

        return true;
    }

    void nQueens(List<String> board, int row, int n, List<List<String>> ans) {

        if (row == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {

                StringBuilder s = new StringBuilder(board.get(row));
                s.setCharAt(j, 'Q');
                board.set(row, s.toString());

                nQueens(board, row + 1, n, ans);

                s.setCharAt(j, '.');
                board.set(row, s.toString());
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {

        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++)
            board.add(".".repeat(n));

        List<List<String>> ans = new ArrayList<>();

        nQueens(board, 0, n, ans);

        return ans;
    }
}