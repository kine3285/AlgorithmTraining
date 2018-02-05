package Dovelet;
import java.util.*;
public class gift_giver {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] def = new int[n];
		int[] curr = new int[n];
		String[] people = new String[n];
		
		for(int i=0;i<n;i++){
			people[i] = sc.nextLine();
		}
		System.out.println("peoples..");
		for(int m=0;m<n;m++){
			String s = sc.next();
			int money = sc.nextInt();
			int k = sc.nextInt();
			for(int i=0;i<n;i++){
				if(s.equals(people[i])){
					def[i]+=money;
					curr[i] += money - (money/k)*k;
				}
					
			}
			for(int i=0;i<k;i++){
				String temp = sc.nextLine();
				for(int j=0;j<n;j++){
					if(temp.equals(people[j]))
						curr[j] += money/k;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(people[i]+" "+(def[i]-curr[i]));
		}
		
	}
}
