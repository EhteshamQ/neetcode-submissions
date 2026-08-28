class Solution {
    public boolean isSubsequence(String s, String t) {

        boolean[][] dp = new boolean[s.length()+1 ][t.length() + 1];
        int n = s.length(), m = t.length();
        for(int j = 0; j <= t.length(); j++) {
            dp[n][j] = true;
        }

        for(int i = n-1; i >= 0 ; i--) {
            for(int j = m-1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = dp[i+1][j+1];
                }
                else
                dp[i][j] = dp[i][j+1];
            }
        }
    
        return dp[0][0];
    }


}