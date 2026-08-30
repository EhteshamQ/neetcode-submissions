class Solution {
    public int[] memo;
    public int rob(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];



        int[] firstIncluded = Arrays.copyOfRange(nums, 0, nums.length-1);
        int[] lastIncluded = Arrays.copyOfRange(nums, 1, nums.length);
        memo = new int[nums.length-1];
        int firstRob = robHouse(firstIncluded);
        // memo = new int[nums.length-1];
        int lastRob = robHouse(lastIncluded);
        return Math.max(firstRob, lastRob);
    }

    public int robHouse(int[] nums) {

         if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];


        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i < nums.length; i++) {
            memo[i] = Math.max(memo[i-1], memo[i-2] + nums[i]);
        }

        return memo[nums.length-1];
        
        // if (index == 0)
        //     return nums[index];
        // if (index == 1)
        //     return Math.max(nums[0], nums[1]);
        // if (memo[index] != 0)
        //     return memo[index];
        // return memo[index] = Math.max(nums[index] + robHouse(nums, index -2), robHouse(nums, index-1));
    }
}
