package Dovelet;
import java.util.*;

public class grp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		int cnt=0;
		for(int i=1;i<=n-k+1;i++){
			int currsum=0;
			for(int j=i;j<k+i;j++){
				currsum+=j;
			}
			if(currsum > 14 && currsum % 15 == 0)cnt++;
		}
		
		System.out.println(cnt);
	}
}
