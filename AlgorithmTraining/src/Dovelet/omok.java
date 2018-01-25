package Dovelet;
import java.util.*;
public class omok {
	static int[][] field;
	public static int omokchecker(int i, int j, int color){
		if(leftright(i,j,color) == 5){
			if(j>0 && field[i][j-1] == field[i][j]){}
			else return 1;
		}
		else if(updown(i,j,color)==5){
			if(i>0 && field[i-1][j] == field[i][j]){}
			else return 2;
		}
		else if(leftup(i,j,color)==5){
			if(i>0 && j>0 && field[i-1][j-1] == field[i][j]){}
			else return 3;
		}
		else if(rightup(i,j,color)==5){
			if(i>0 && j<18 && field[i-1][j+1] == field[i][j]){}
			else return 4;
		}
		return 0;
	}
	public static int updown(int i, int j, int color){
		int cnt=0;
		int ii=i,jj=j;
		while(true){
			if(ii<0 || ii>18 || jj<0 || jj>18 || field[ii][jj] != color)break;
			cnt++;
			ii++;
		}
		return cnt;
	}
	public static int leftright(int i, int j, int color){
		int cnt=0;
		int ii=i,jj=j;
		while(true){
			if(ii<0 || ii>18 || jj<0 || jj>18 || field[ii][jj] != color)break;
			cnt++;
			jj++;
		}
		return cnt;
	}
	public static int leftup(int i, int j, int color){
		int cnt=0;
		int ii=i,jj=j;
		while(true){
			if(ii<0 || ii>18 || jj<0 || jj>18 || field[ii][jj] != color){
				break;
			}
			cnt++;
			ii++;jj++;
		}
		return cnt;
	}
	public static int rightup(int i, int j, int color){
		int cnt=0;
		int ii=i,jj=j;
		while(true){
			if(ii<0 || ii>18 || jj<0 || jj>18 || field[ii][jj] != color)break;
			cnt++;
			ii++;jj--;
		}
		return cnt;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		field = new int[19][19];
		for(int i=0;i<19;i++){
			for(int j=0;j<19;j++){
				field[i][j] = sc.nextInt();
			}
		}
		int vector=0;
		int winner=0;
		int positioni=0,positionj=0;
		for(int i=0;i<19;i++){
			for(int j=0;j<19;j++){
				if(field[i][j]>0){
					vector = omokchecker(i,j,field[i][j]);
					if(vector>0){
						winner=field[i][j];
						positioni=i;
						positionj=j;
						break;
					}
				}
			}
			if(vector>0)break;
		}
		
		
		
		if(vector == 4){
			positioni+=4;
			positionj-=4;
		}
		
		System.out.println(winner);
		if(winner>0)
			System.out.println(++positioni + " " + ++positionj);
	}
}
