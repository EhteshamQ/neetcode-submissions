class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (p == 0)
            return 0;

        Arrays.sort(nums);

        int l = 0, r = (int)Math.pow(10, 9); 
        int max = (int)Math.pow(10, 9);

        while(l <= r ) {
            int m = l + (r-l)/2;
            if (isValid(nums, m, p)) {
                r = m-1;
                max = m;
            }
            else {
                l = m + 1;
            }
        }

        return max;


    }


    public boolean isValid(int nums[], int threshold, int p) {
        int i = 0, count = 0;
        // Check greedily if any pair is less than threshold. 
        while(i < nums.length -1) {
            // Check if the Sum of a Pair is less than threshold, if yes, Skip 2 (Pair)
            if (Math.abs(nums[i] - nums[i+1]) <= threshold) {
                i+= 2;
                count++;
            }
            // If no Skip only the current num
            else {
                i++;
            }

            if (count == p) {
                return true;
            }
        }
        return false;
    }
}