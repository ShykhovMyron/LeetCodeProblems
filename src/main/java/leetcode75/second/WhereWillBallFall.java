package leetcode75.second;

public class WhereWillBallFall {
    public int[] findBall(int[][] grid) {
        int[] answer = new int[grid[0].length];
        for (int i = 0; i < answer.length; i++) answer[i] = i;
        for (int[] currentRow : grid) {
            for (int i = 0; i < answer.length; i++) {
                int curInd = answer[i];
                if (curInd != -1) {
                    if (curInd < 0 || curInd >= currentRow.length) answer[i] = -1;
                    else if (curInd > 0 && currentRow[curInd] == -1 && currentRow[curInd - 1] == -1) {
                        answer[i] = curInd - 1;
                    } else if (curInd < currentRow.length - 1 && currentRow[curInd] == 1 && currentRow[curInd + 1] == 1) {
                        answer[i] = curInd + 1;
                    } else answer[i] = -1;
                }
            }
        }
        return answer;
    }
}
