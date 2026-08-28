class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums = numbers;
        int l = 0, r = nums.length -1;

        while(l < r) {
            while(nums[l] + nums[r] > target) {
                r--;
            }
            while(nums[l] + nums[r] < target) {
                l++;
            }
            if (l < nums.length && r >= 0 && nums[l] + nums[r] == target)
                return new int[]{l + 1 , r+ 1};
        }
    return new int[]{0, 0};
    }
}
