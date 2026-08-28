class Solution {
    public int maxArea(int[] nums) {
        int l = 0, r = nums.length -1; 
        int maxWater = 0;
        while(l < r) {
            int min = Math.min(nums[l] , nums[r]);
            int capacity = min * (r - l);
            maxWater = Math.max(maxWater, capacity);
            if (nums[l] > nums[r])
                r--;
            else 
                l++;
        }

        return maxWater;

    }
}
