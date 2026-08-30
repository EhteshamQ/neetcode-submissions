class Solution {
    Boolean[][] memo;
    public boolean canPartition(int[] nums) {
        
        if (nums.length <= 1)
            return false;

        int sum = Arrays.stream(nums).sum();
        if (sum % 2 != 0)
            return false;
        sum /= 2;
        memo = new Boolean[nums.length+1][sum+1];
        // Find Sum/2 in Array. 
        return hasSubSetForSum(nums, sum, nums.length-1);
    }


    public boolean hasSubSetForSum(int nums[], int sum, int i) {
        if (sum == 0)
            return true;
        
        if (i < 0)
            return false;

        if (sum < nums[i]) {
            return false;
        }

        if (memo[i][sum] != null)
            return memo[i][sum];

        return memo[i][sum] = hasSubSetForSum(nums, sum-nums[i] , i-1) || hasSubSetForSum(nums, sum, i-1);
        

    }
}
