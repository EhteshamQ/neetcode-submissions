class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        return Math.min(findCost(cost, 1, dp) ,findCost(cost, 0, dp));
    }

    public int findCost(int[] cost, int i, int dp[]) {
        if (i >= cost.length)
            return 0;

        if (dp[i] != 0)
            return dp[i];
        return dp[i] = cost[i] + Math.min(findCost(cost, i+1, dp) , findCost(cost, i+2, dp));
    }


}
