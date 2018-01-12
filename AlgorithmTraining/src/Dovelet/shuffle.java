package Dovelet;
import java.util.*;
public class shuffle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n==0 && k==0)break;
			
			int[] cards = new int[n];
			
			for(int i=0;i<n;i++){
				cards[i] = n-i;
			}
			
			for(int i=0;i<k;i++){
				int p = sc.nextInt();
				int c = sc.nextInt();
				int[] arr = new int[n];
				for(int l=0;l<n;l++){
					arr[l] = n-l;
				}
				
				for(int j=0;j<c;j++){
					arr[j] = cards[j+p-1];
				}
				
				for(int j=c;j<p+c-1;j++){
					arr[j] = cards[j-c];
				}
				cards = arr;
			}
			System.out.println(cards[0]);
			sc.close();
		}
	}
}
