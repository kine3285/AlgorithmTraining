package Dovelet;
import java.util.*;
public class vito {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int home = 0;
		int result = 0;
		if(n%2 != 0){
			home = arr[n/2];
			for(int i=0;i<n;i++){
				result += Math.abs(home-arr[i]);
			}
			System.out.println(result);
		}else{
			home = arr[n/2];
			for(int i=0;i<n;i++){
				result += Math.abs(home-arr[i]);
			}
			int result2 = 0;
			home = arr[n/2-1];
			for(int i=0;i<n;i++){
				result2 += Math.abs(home-arr[i]);
			}
			System.out.println(Math.min(result, result2));
		}
		
	}
}
