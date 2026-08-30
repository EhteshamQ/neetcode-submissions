class Solution {
    int[] memo;
    
    public int climbStairs(int n) {
        if (memo == null)
        {
            memo = new int[n+1];
        }
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        if (memo[n] == 0)
        {
            memo[n-1] = climbStairs(n-1);
            memo[n-2] = climbStairs(n-2);
        }
        return memo[n] = memo[n-1] + memo[n-2];
        
    }
}
