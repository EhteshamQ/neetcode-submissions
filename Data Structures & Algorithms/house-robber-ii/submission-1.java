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
        int firstRob = robHouse(firstIncluded, firstIncluded.length-1);
        memo = new int[nums.length-1];
        int lastRob = robHouse(lastIncluded, lastIncluded.length-1);
        return Math.max(firstRob, lastRob);
    }

    public int robHouse(int[] nums, int index) {
        if (index == 0)
            return nums[index];
        if (index == 1)
            return Math.max(nums[0], nums[1]);
        if (memo[index] != 0)
            return memo[index];
        return memo[index] = Math.max(nums[index] + robHouse(nums, index -2), robHouse(nums, index-1));
    }
}
