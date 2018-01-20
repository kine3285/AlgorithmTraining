package Dovelet;
import java.util.*;
public class bomb_game {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[m][n];
		int bombnum=0;
		for(int i=0;i<k;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			a--;
			b--;
			int p = sc.nextInt();
			int check = sc.nextInt();
			if(check == 1)bombnum++;
			int startrow=a-(p/2);
			int startcol=b-(p/2);
			int endrow=a+(p/2);
			int endcol=b+(p/2);
			if(startrow<0)startrow=0;
			if(startcol<0)startcol=0;
			if(endrow>=m)endrow=m-1;
			if(endcol>=n)endcol=n-1;
			
			
			if(check == 0){
				for(int aa=startrow;aa<=endrow;aa++){
					for(int bb=startcol;bb<=endcol;bb++){
							arr[aa][bb] = -1;
					}
				}
			}else{
				for(int aa=startrow;aa<=endrow;aa++){
					for(int bb=startcol;bb<=endcol;bb++){
							if(arr[aa][bb] != -1){
								arr[aa][bb]++;
							}
					}
				}
			}
		}
		int cnt=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(arr[i][j] == bombnum){
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
}
