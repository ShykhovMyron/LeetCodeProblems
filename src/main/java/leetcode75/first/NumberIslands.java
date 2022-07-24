package leetcode75.first;

public class NumberIslands {
    public int numIslands(char[][] grid) {
        int numIfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    findIsland(grid, i, j);
                    numIfIslands++;
                }
            }
        }

        return numIfIslands;
    }

    private void findIsland(char[][] grid, int i, int j) {
        if (i < 0 || i > grid.length || j < 0 || j > grid[0].length || grid[i][j] != '1') return;
        grid[i][j]++;
        findIsland(grid, i - 1, j);
        findIsland(grid, i + 1, j);
        findIsland(grid, i, j - 1);
        findIsland(grid, i, j + 1);
    }
}
