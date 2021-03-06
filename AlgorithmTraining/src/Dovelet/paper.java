package Dovelet;
import java.util.*;
public class paper {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int n = sc.nextInt();
		int[] rowcut = new int[n];
		int[] colcut = new int[n];
		Arrays.fill(rowcut, 101);
		Arrays.fill(colcut, 101);
		int aa=0;
		int bb=0;
		for(int i=0;i<n;i++){
			int check = sc.nextInt();
			int a = sc.nextInt();
			if(check == 1){
				rowcut[aa++] = a;
			}else{
				colcut[bb++] = a;
			}
		}
		
		Arrays.sort(rowcut);
		Arrays.sort(colcut);
		int Amax = row;
		if(aa>0){
			Amax = rowcut[0]-0;
			for(int i=1;i<aa;i++){
				Amax = Math.max(Amax, rowcut[i]-rowcut[i-1]);
			}
			Amax = Math.max(Amax, row-rowcut[aa-1]);
		}
		
		int Bmax = col;
		if(bb>0){
			Bmax = colcut[0]-0;
			for(int i=1;i<bb;i++){
				Bmax = Math.max(Bmax, colcut[i]-colcut[i-1]);
			}
			Bmax = Math.max(Bmax, col-colcut[bb-1]);
		}
		
		System.out.println(Amax*Bmax);
	}
}
