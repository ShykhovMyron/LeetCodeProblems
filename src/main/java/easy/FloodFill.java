package easy;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        change(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private void change(int[][] image, int sr, int sc, int newColor, int original) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != original)
            return;
        image[sr][sc] = newColor;
        change(image, sr - 1, sc, newColor, original);
        change(image, sr + 1, sc, newColor, original);
        change(image, sr, sc - 1, newColor, original);
        change(image, sr, sc + 1, newColor, original);
    }
}
