class Solution {
    public boolean isSubsequence(String s, String t) {

        int[][] dp = new int[s.length()][t.length()];

        for(int[] row: dp) {
            Arrays.fill(row, -1);
        }

        return rec(s, t, 0, 0, dp);

    }


    private boolean rec(String s, String t, int i, int j, int[][]memo){
        if (i == s.length()) return true;
        if (j == t.length()) return false;

        if (memo[i][j] != -1)
            return memo[i][j] == 1;

        if(s.charAt(i) == t.charAt(j)) {
            memo[i][j] = rec(s, t, i+1, j+1, memo) ? 1 : 0;
        } else {
            memo[i][j] = rec(s, t, i, j+1, memo) ? 1 : 0;
        }

        return memo[i][j] == 1;
    }


}