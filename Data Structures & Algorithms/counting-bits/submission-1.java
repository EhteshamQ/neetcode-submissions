class Solution {
    public int[] countBits(int n) {
        if (n == 0)
            return new int[]{0};
        
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++) {
            dp[i] = countBitsForNum(i, dp);
        }

        return dp;

    }


    int countBitsForNum(int num, int[] dp) {
        int count = 0;
        int n = num;
        while(n > 0) {
           count +=  n & 1;
           n = n >> 1;
           if(dp[n] != -1) {
                count += dp[n];
                break;   
           }

        }
        return count;
    }
}
