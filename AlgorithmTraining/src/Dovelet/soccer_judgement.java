package Dovelet;
import java.util.*;
public class soccer_judgement {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double[] arr = new double[k+1];
		for(int i=0;i<n;i++){
			int people = sc.nextInt();
			int judge = sc.nextInt();
			for(int j=0;j<judge;j++){
				int a = sc.nextInt();
				int b = sc.nextInt();
				arr[a] += (double)b/(double)people;
			}
		}
		double max=0;
		int result=0;
		for(int i=1;i<k+1;i++){
			if(max < arr[i]){
				max = arr[i];
				result=i;
			}
			
		}
		System.out.println(result);
	}
}
