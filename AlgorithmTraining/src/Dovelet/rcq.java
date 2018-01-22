package Dovelet;
import java.util.*;
public class rcq {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i=0;i<k;i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			start--;end--;
			int[] temp = new int[end-start+1];
			for(int j=start;j<=end;j++){
				temp[j-start] = arr[j];
			}
			Arrays.sort(temp);
			int result=0;
			result = (temp.length%2 == 0 ? temp[temp.length/2-1] : temp[temp.length/2]);
			
			System.out.println(result);
			
		}
	}
}
