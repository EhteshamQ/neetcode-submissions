class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                {
                    int area = getArea(i , j , grid);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }

    int getArea(int row, int col, int[][] grid) {
        int area = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(row, col));
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            if (grid[pair.left][pair.right] == 0)
                continue;
            area++;
            grid[pair.left][pair.right] = 0;

              // up
        if (pair.left - 1 >= 0 && grid[pair.left - 1][pair.right] == 1) {
            queue.offer(new Pair(pair.left - 1, pair.right));
        }
        // down
        if (pair.left + 1 < grid.length && grid[pair.left + 1][pair.right] == 1) {
            queue.offer(new Pair(pair.left + 1, pair.right));
        }
        // left
        if (pair.right - 1 >= 0 && grid[pair.left][pair.right - 1] == 1) {
            queue.offer(new Pair(pair.left, pair.right - 1));
        }
        // right
        if (pair.right + 1 < grid[0].length && grid[pair.left][pair.right + 1] == 1) {
            queue.offer(new Pair(pair.left, pair.right + 1));
        }

        }
        return area; 
    }

    static class Pair{
        int left;
        int right;
        Pair(int l, int r) {
            left = l;
            right = r;
        }
    }

}
