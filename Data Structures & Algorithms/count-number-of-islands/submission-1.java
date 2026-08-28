class Solution {
    public int numIslands(char[][] grid) {

        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0')
                    continue;
                else
                    {
                    markIsland(i , j , grid);
                    count++;
                    }
            }
        }
        return count;
    }

    public void markIsland(int row, int col, char[][]grid) {
        Queue<Pair> queue = new LinkedList<>(); 
        queue.offer(new Pair(row, col));
        while(!queue.isEmpty()) {
            var pair = queue.poll(); 
            grid[pair.left][pair.right] = '0';
            if (pair.left - 1 >= 0 && grid[pair.left - 1][pair.right] == '1')
                queue.offer(new Pair(pair.left-1, pair.right));
            if (pair.left + 1 < grid.length && grid[pair.left + 1][pair.right] == '1')
                queue.offer(new Pair(pair.left+1, pair.right));
            if (pair.right - 1 >= 0 && grid[pair.left ][pair.right - 1] == '1')
                queue.offer(new Pair(pair.left, pair.right - 1));
            if (pair.right + 1 < grid[0].length && grid[pair.left][pair.right+1] == '1')
                queue.offer(new Pair(pair.left, pair.right+1));
        } 
    }

    static class Pair{
        int left;
        int right;
        Pair(int l ,int r) {
            left = l;
            right = r;
        }
    }
}
