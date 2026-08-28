class Solution {
    public int trap(int[] height) {

        int maxLeft = 0, maxRight = 0;
        int l = 0, r = height.length -1;
        int sum = 0;
        while(l <= r) {
            if (maxLeft <= maxRight) {
                sum += Math.max(maxLeft - height[l] ,0);
                maxLeft = Math.max(maxLeft, height[l]);
                l++;
            }
            else {
                sum += Math.max( maxRight - height[r] ,0);
                maxRight = Math.max(maxRight, height[r]);
                r--;
            }
        }

    return sum;
    }


}
