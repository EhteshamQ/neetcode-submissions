class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Pair> st = new Stack<>();
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++) {
            int minIndex = heights.length;
            while(!st.isEmpty() && st.peek().value > heights[i]) {
                Pair p = st.pop();
                int area = p.value * (i - p.index);
                minIndex = Math.min(p.index, minIndex);
                maxArea = Math.max(area, maxArea);
            }
            st.push(new Pair(Math.min(i, minIndex), heights[i]));
        }
        while(!st.isEmpty()) {
                Pair p = st.pop();
                int area = p.value * (heights.length - p.index);
                maxArea = Math.max(area, maxArea);
        }
    return maxArea;
    }

    static class Pair {
        int index;
        int value;

        public Pair(int i, int v) {
            index= i;
            value = v;
        }
    }
}
