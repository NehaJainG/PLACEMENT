package graphs;

public class FloodFill {
    void dfs(int[][] image, int[][] ans, int sr, int sc, int iniColor, int newColor, int[] dRow, int[] dCol){
        ans[sr][sc] = newColor;
        int n = image.length;
        int m = image[0].length;

        for(int i = 0; i < 4; i++){
            int nr = sr + dRow[i];
            int nc = sc + dCol[i];
            if(nr >= 0 && nr < n && nc >= 0 && nc < m && image[nr][nc] == iniColor && ans[nr][nc] != newColor){
                dfs(image, ans, nr,nc, iniColor, newColor, dRow, dCol);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] result = image;
        int inColor = image[sr][sc];
        int deltaR[] = new int[]{0,-1,0,1};
        int deltaC[] = new int[]{-1,0,1,0};
        dfs(image, result, sr, sc, inColor, color, deltaR, deltaC);
        return result;
    }
}
