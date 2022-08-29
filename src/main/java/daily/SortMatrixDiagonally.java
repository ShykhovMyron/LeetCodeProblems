package daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMatrixDiagonally {
  public int[][] diagonalSort(int[][] mat) {
    List<List<Integer>> diagColumn = new ArrayList<>(mat[0].length);
    List<List<Integer>> diagRow = new ArrayList<>(mat.length);
    for (int x = 0; x < mat.length; x++) diagColumn.add(getDiagFromPos(mat, x, 0));
    for (int y = 1; y < mat[0].length; y++) diagRow.add(getDiagFromPos(mat, 0, y));
    diagColumn.forEach(Collections::sort);
    diagRow.forEach(Collections::sort);
    for (int x = 0; x < mat.length; x++) setNewNumbers(diagColumn.get(x), mat, x, 0);
    for (int y = 1; y < mat[0].length; y++) setNewNumbers(diagRow.get(y - 1), mat, 0, y);
    return mat;
  }

  private List<Integer> getDiagFromPos(int[][] mat, int x, int y) {
    int length = Math.min(mat.length, mat[0].length);
    List<Integer> result = new ArrayList<>(length);
    for (int i = 0; i < length; i++) {
      if (x >= mat.length || y >= mat[0].length) return result;
      result.add(mat[x++][y++]);
    }
    return result;
  }

  private void setNewNumbers(List<Integer> diag, int[][] mat, int x, int y) {
    for (Integer integer : diag) {
      mat[x++][y++] = integer;
    }
  }
}
