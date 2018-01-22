package Dovelet;
import java.util.*;
public class table2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		int nations[] = {5,5,5,5};
		int table[] = new int[4];
		int nationcnt=0;
		for(int i=0;i<4;i++){
			int row=5;
			int col=5;
			int max=Integer.MIN_VALUE;
			for(int j=0;j<4;j++){
				if(j != nations[0] && j != nations[1] && j != nations[2] && j != nations[3])
				if(arr[j][i] > max){
					max = arr[j][i];
					row=j;
					col=i;
					nations[nationcnt]=j;
				}
			}
			for(int j=0;j<4;j++){
				if(j != nations[nationcnt]){
					table[nationcnt]+=arr[j][i];
				}
			}
			nationcnt++;
		}
		for(int i=0;i<4;i++)System.out.print(nations[i]+" ");
		System.out.println();
		for(int i=0;i<4;i++)System.out.print(table[i]+" ");
		System.out.println();
		int max=0;
		for(int i=0;i<4;i++)max+=table[i];
		System.out.println(max);
	}
}
