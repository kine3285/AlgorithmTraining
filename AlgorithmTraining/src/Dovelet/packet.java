package Dovelet;
import java.util.*;
public class packet {
	public static int packet(int[] arr, int pages){
		
		return pages;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0;i<6;i++){
			arr[i] = sc.nextInt();
		}
		sc.close();
		int pages=arr[5];
		
		pages+=arr[4];
		int one = arr[4]*11-arr[0];
		if(one<0) one = 0;
		arr[0] = arr[0] - arr[4]*11;
		if(arr[0]<0)arr[0] = 0;
		
		pages+=arr[3];
		int two = arr[3]*5-arr[1];
		if(two<0) two = 0;
		arr[1] = arr[1] - arr[3]*5;
		if(arr[1]<0)arr[1] = 0;
		
		pages+=arr[2]/4;
		int three=0;
		if(arr[3]%4!=0){
			pages++;
			three = 4-arr[3]%4;
		}
		
		if(arr[1]>0){
			if(three == 3){
				if(arr[1]<6){
					
					arr[1]=0;
				}
			}
		}
		
		
		System.out.println(pages);
	}
}
