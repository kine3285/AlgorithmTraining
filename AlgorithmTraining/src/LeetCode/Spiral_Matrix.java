package LeetCode;

import java.util.*;

public class Spiral_Matrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int garostart = 0;
		int garoend = matrix.length;
		int serostart = 0;
		int seroend = matrix[0].length;
		while(garostart <= garoend && serostart <= seroend){
			for(int i=garostart; i<garoend; i++){
				list.add(matrix[garostart][i]);
			}
			garostart++;
			//정방향 가로. 
			
			for(int i=serostart; i<seroend; i++){
				list.add(matrix[i][serostart]);
			}
			seroend--;
			//정방향 세로.
			
			if (garostart <= garoend) {
                for (int j = seroend; j >= serostart; j --) {
                    list.add(matrix[seroend][j]);
                }
            }
            garostart--;
            //역방향 가로.
            
            if (serostart <= seroend) {
                for (int j = garoend; j >= garostart; j --) {
                    list.add(matrix[j][serostart]);
                }
            }
            serostart ++;
            //역방향 세로.
		}
		return list;
	}
}
