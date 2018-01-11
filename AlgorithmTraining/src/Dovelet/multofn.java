package Dovelet;
import java.util.*;
public class multofn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int cnt=0;
		for(int i=1;i<4;i++){
			for(int j=1;j<4;j++){
				for(int k=1;k<4;k++){
					for(int l=1;l<4;l++){
						int num = i*1000+j*100+k*10+l;
						if(num%n == 0){
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
