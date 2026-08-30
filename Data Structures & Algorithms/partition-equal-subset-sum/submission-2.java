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
        return hasSubSetForSum(nums, sum);
    }


    public boolean hasSubSetForSum(int nums[], int sum) {
       
       Arrays.fill(memo[0], false);
       for(int i = 0; i < memo.length; i++) {
            memo[i][0] = true;
       }

       for(int i = 1; i < memo.length-1; i++) {
        for(int j = 1; j <= sum; j++) {
            if (nums[i] > j)
                memo[i][j] = false;
            else
                memo[i][j] = memo[i-1][j-nums[i]] || memo[i-1][j];
        }
       }
       
      
        return memo[nums.length-1][sum];
       
       // Recursive DP
        // if (sum == 0)
        //     return true;
        
        // if (i < 0)
        //     return false;

        // if (sum < nums[i]) {
        //     return false;
        // }

        // if (memo[i][sum] != null)
        //     return memo[i][sum];

        // return memo[i][sum] = hasSubSetForSum(nums, sum-nums[i] , i-1) || hasSubSetForSum(nums, sum, i-1);
        

    }
}
