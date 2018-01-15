package Dovelet;
import java.util.*;
public class roller_coaster {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++){
			int r = sc.nextInt();
			int k = sc.nextInt();
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			int money=0;
			int start=0;
			int people=0;
			//r번 운행한다.
//			for(int i=0;i<r;i++){
//				while(true){
//					people+=arr[start%n];
//					start++;
//					System.out.println("people is "+people+", start is "+start);
//					if(people>k){
//						start--;
//						people-=arr[start%n];
//						System.out.println("over!!! people is "+people+", start is "+start);
//						break;
//					}
//				}
//				
//				money+=people;
//				people=0;
//			}
			int temp=0;
			for(int i=0;i<r;i++){
				while(true){
					people+=arr[start%n];
					temp=arr[start%n];
					arr[start%n]=0;
					start++;
					System.out.println("people is "+people+", start is "+start);
					if(people>k || arr[start%n]==0){
						start--;
						arr[start%n]=temp;
						temp=0;
						people-=arr[start%n];
						
						System.out.println("over!!! people is "+people+", start is "+start);
						break;
					}
				}
				
				money+=people;
				people=0;
			}
			System.out.println(money);
			money=0;
		}
	}
}
