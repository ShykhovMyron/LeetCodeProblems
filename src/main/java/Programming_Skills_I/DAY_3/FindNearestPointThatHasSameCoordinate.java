package Programming_Skills_I.DAY_3;

public class FindNearestPointThatHasSameCoordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int[] point = points[i];
            if (point[0] == x || point[1] == y) {
                int sum = Math.abs(point[0] - x) + Math.abs(point[1] - y);
                if (sum < min) {
                    min = sum;
                    index = i;
                }
            }
        }
        return index;
    }
}
