package Dovelet;
import java.util.*;
public class square {
	public static boolean checker(int n){
		double num = Math.sqrt(n);
		if(num == (int)num){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		int cnt=0;
		int first=0;
		int sum=0;
		for(int i=low;i<=high;i++){
			if(checker(i)){
				if(cnt==0)first=i;
				cnt++;
				sum+=i;
			}
		}
		if(cnt==0){
			System.out.println("-1");
		}else{
			System.out.println(sum);
			System.out.println(first);
		}
	}
}
