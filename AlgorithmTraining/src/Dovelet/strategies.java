package Dovelet;
import java.util.*;
public class strategies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int bill = 0;
		int steve = 0;
		int linus = 0;
		int billscore=0;
		int currtime=0;
		for(int i=0;i<n;i++){
			currtime+=arr[i];
			billscore+=currtime;
			bill++;
			if(billscore > time){
				billscore-=currtime;
				bill--;
				break;
			}
		}
		Arrays.sort(arr);
		int stevescore=0;
		currtime=0;
		for(int i=0;i<n;i++){
			currtime+=arr[i];
			stevescore+=currtime;
			steve++;
			if(currtime > time){
				stevescore-=currtime;
				steve--;
				break;
			}
		}
		
		int linusscore = 0;
		currtime=0;
		for(int i=n-1;i>=0;i--){
			currtime+=arr[i];
			linusscore+=currtime;
			linus++;
			if(linusscore>time){
				linusscore-=currtime;
				linus--;
				break;
			}
		}
		int winner = Math.max(Math.max(bill, steve), linus);
		int min = Math.min(Math.min(billscore, stevescore), linusscore);
		if(winner == bill){
			if(bill != steve && bill != linus){
				System.out.println("Bill wins with "+winner+" solved problems and a score of "+billscore+".");
			}else if(bill == steve){
				if(billscore < stevescore){
					System.out.println("Bill wins with "+winner+" solved problems and a score of "+billscore+".");
				}else if(billscore > stevescore){
					System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
				}else{
					System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
				}
			}else if(bill == linus){
				if(billscore < linusscore){
					System.out.println("Bill wins with "+winner+" solved problems and a score of "+billscore+".");
				}else if(billscore > linusscore){
					System.out.println("Linus wins with "+winner+" solved problems and a score of "+linusscore+".");
				}else{
					System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
				}
			}
		} else if(winner == steve){
			if(steve != bill && steve != linus){
				System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
			}else if(steve == bill){
				if(billscore < stevescore){
					System.out.println("Bill wins with "+winner+" solved problems and a score of "+billscore+".");
				}else if(billscore > stevescore){
					System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
				}else{
					System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
				}
			}else if(steve == linus){
				if(stevescore < linusscore){
					System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
				}else if(stevescore > linusscore){
					System.out.println("Linus wins with "+winner+" solved problems and a score of "+linusscore+".");
				}else{
					System.out.println("Steve wins with "+winner+" solved problems and a score of "+stevescore+".");
				}
			}
		}else if(winner == linus){
			System.out.println("Linus wins with "+winner+" solved problems and a score of "+linusscore+".");
		}
	}
}
