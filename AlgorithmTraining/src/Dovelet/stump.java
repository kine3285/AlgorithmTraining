package Dovelet;
import java.util.*;
public class stump {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int check=-1;
		arr[0] = sc.nextInt();
		for(int i=1;i<n;i++){
			arr[i] = sc.nextInt();
			if(arr[i]-arr[i-1]<=0 && check==-1){
				System.out.println(i);
				check=1;
			}else if(arr[i]-arr[i-1]>=0 && check==1){
				check=-1;
			}else if(arr[i]-arr[i-1]==0 && check == -1){
				System.out.println(i);
			}
			
		}
		sc.close();
		if(n==1)System.out.println(n);
		
		
		

		
	}
}
