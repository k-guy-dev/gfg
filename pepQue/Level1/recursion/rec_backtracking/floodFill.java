package pepQue.Level1.recursion.rec_backtracking;

import java.util.*;

class floodFill {

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited) {

        if (row < 0 || col < 0 || row == maze.length || col == maze[0].length || maze[row][col] == 1
                || visited[row][col] == true) {
            return;
        }
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        floodfill(maze, row - 1, col, psf + "t", visited); // top
        floodfill(maze, row, col - 1, psf + "t", visited); // left
        floodfill(maze, row + 1, col, psf + "t", visited); // down
        floodfill(maze, row, col + 1, psf + "t", visited); // right

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        floodfill(arr);
    }
}
