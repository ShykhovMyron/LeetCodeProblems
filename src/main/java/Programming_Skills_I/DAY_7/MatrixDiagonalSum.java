package Programming_Skills_I.DAY_7;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i1 = 0, i2 = 0; i1 < mat.length; i1++, i2++) {
            sum += mat[i1][i2];
            if (i2 != mat.length - i2 - 1) sum += mat[i1][mat.length - i2 - 1];
        }

        return sum;
    }
}
