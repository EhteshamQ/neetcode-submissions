class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] subBoxes = new HashSet[9];
    
        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            subBoxes[i] = new HashSet<>();
        }

        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[i].length; j++){
                char ch = board[i][j];
                if(ch == '.')
                    continue;
                if(rows[i].contains(ch))
                    return false;
                rows[i].add(ch);
                if(cols[j].contains(ch))
                    return false;
                cols[j].add(ch); 
                if(subBoxes[(i/3) * 3 + j/3].contains(ch))
                    return false;
                subBoxes[(i/3) * 3 + j/3].add(ch);
                    
                }
            }
        return true;
    }
}
