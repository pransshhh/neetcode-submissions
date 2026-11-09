class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i = 0; i < board.length; i++) {
            Set<Integer> set = new HashSet();
            for(int j = 0; j < board[0].length; j++) {
                char ch = board[i][j];
                if(ch >= '1' && ch <= '9') {
                    if(set.contains(ch - '0')) return false;
                    set.add(ch - '0');
                }
            }
        }

        for(int i = 0; i < board.length; i++) {
            Set<Integer> set = new HashSet();
            for(int j = 0; j < board[0].length; j++) {
                char ch = board[j][i];
                if(ch >= '1' && ch <= '9') {
                    if(set.contains(ch - '0')) return false;
                    set.add(ch - '0');
                }
            }
        }

        for(int sq = 0; sq < board.length; sq++) {
            Set<Integer> set = new HashSet();
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    int row = (sq / 3) * 3 + i;
                    int col = (sq % 3) * 3 + j;
                    char ch = board[row][col];
                    if(ch >= '1' && ch <= '9') {
                        if(set.contains(ch - '0')) return false;
                        set.add(ch - '0');
                    }
                }
            }
        }
        return true;
    }
}
