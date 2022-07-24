package leetcode75.first;

import java.util.HashMap;
import java.util.Map;

public class UniquePaths {
    Map<Pair, Integer> visited = new HashMap<>();

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        return move(grid, 0, 0);
    }

    private int move(int[][] grid, int x, int y) {
        if (x >= grid.length || y >= grid[0].length) return 0;
        if (x == grid.length - 1 && y == grid[0].length - 1) return 1;
        if (visited.containsKey(new Pair(x, y))) return visited.get(new Pair(x, y));

        int paths = move(grid, x + 1, y) + move(grid, x, y + 1);
        visited.put(new Pair(x, y), paths);
        return paths;
    }

    private record Pair(int x, int y) {
    }
}
