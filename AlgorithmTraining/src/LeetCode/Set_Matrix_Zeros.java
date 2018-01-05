package LeetCode;

import java.util.Arrays;

public class Set_Matrix_Zeros {
	public void setZeroes(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(matrix[i][j]==0){
					Arrays.fill(matrix, 0);
				}
			}
		}
	}
}
