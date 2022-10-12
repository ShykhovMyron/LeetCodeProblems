package Programming_Skills_I.DAY_7;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int columns = mat.length;
        int rows = mat[0].length;
        if (columns * rows != r * c) return mat;

        int[][] result = new int[c][r];
        int y = 0, x = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                result[i][j] = mat[y][x];
                if (x >= rows) {
                    x = 0;
                    y++;
                } else x++;
            }
        }

        return result;
    }
}
