package leetcode75.second;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int columnBegin = 0;
        int columnEnd = matrix.length - 1;
        int rowBegin = 0;
        int rowEnd = matrix[0].length - 1;

        while (rowEnd >= rowBegin && columnEnd >= columnBegin) {
            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(matrix[columnBegin][i]);
            }
            columnBegin++;
            for (int i = columnBegin; i <= columnEnd; i++) {
                result.add(matrix[i][rowEnd]);
            }
            rowEnd--;
            if (rowBegin < rowEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[columnEnd][i]);
                }
            }
            columnEnd--;
            if (columnBegin <= columnEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    result.add(matrix[i][rowBegin]);
                }
            }
            rowBegin++;
        }

        return result;
    }
}
