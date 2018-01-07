package LeetCode;

public class Mininum_Path_Sum {
	public int minPathSum(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(i==0 && j==0){
					arr[i][j] = grid[i][j];
				}else if(i==0){
					arr[i][j] = arr[i][j-1]+grid[i][j];
				}else if(j==0){
					arr[i][j] = arr[i-1][j]+grid[i][j];
				}else{
					arr[i][j] =	Math.min(arr[i-1][j], arr[i][j-1])+grid[i][j];
				}
			}
		}
		return arr[row-1][col-1];
	}

}
