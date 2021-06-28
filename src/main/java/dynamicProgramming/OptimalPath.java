package dynamicProgramming;

import java.util.Arrays;

public class OptimalPath {

    public static void main(String[] args) {
        int[][] grid = {{0,0,0,0,5},{0,1,1,1,0},{2,0,0,0,0}};
        System.out.println(optimPth(grid));
    }

    private static int optimPth(int[][] grid) {

        int total = grid[grid.length - 1][0];
        if (grid.length == 1 && grid[0].length == 1) {
            return total;
        }
        if (grid.length == 1) {
            int[] newIntArray;
            newIntArray = Arrays.copyOfRange(grid[0], 1, grid[0].length);
            int [][] newGrid = {newIntArray};
            return total += optimPth(newGrid);
        }
        if (grid[0].length == 1) {
            int [][] newGrid = new int[1][1];
            newGrid[0][0] = grid[0][0];
            return total += optimPth(newGrid);
        }
        else {
            int[][] upPathGrid = new int[grid.length - 1][];
            for (int i = grid.length - 2; i >= 0; i--) {
                upPathGrid[i] = Arrays.copyOfRange(grid[i], 0, grid[0].length);
            }
            int [][] alongPathGrid = new int[grid.length][grid[0].length - 1];
            for (int i = grid.length -1; i >= 0; i--) {
                alongPathGrid[i] = Arrays.copyOfRange(grid[i], 1, grid[0].length);
            }
            return total += Math.max(optimPth(upPathGrid), optimPth(alongPathGrid));
        }
    }
}
