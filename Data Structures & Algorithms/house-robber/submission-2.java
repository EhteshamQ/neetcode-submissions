class Solution {

    int memo[];

    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        memo = new int[nums.length+1];

        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < nums.length; i++) {
            memo[i] = Math.max(nums[i] + memo[i-2], memo[i-1]);
        }

        return memo[nums.length-1];
        // return robHouses(nums, nums.length-1);
    }

    public int robHouses(int[]nums, int index) {
        if (index == 0)
            return nums[0];
        if (index == 1)
            return Math.max(nums[0], nums[1]);
        
        if (memo[index] != 0)
            return memo[index];

        return memo[index] =  Math.max(nums[index] + robHouses(nums, index-2), robHouses(nums, index-1));        
    }
}
