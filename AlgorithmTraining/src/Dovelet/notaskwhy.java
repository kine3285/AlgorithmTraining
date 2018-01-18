package Dovelet;
import java.util.*;
public class notaskwhy {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] class1 = new int[n];
		int[] class2 = new int[n];
		int[] class3 = new int[n];
		int[] class4 = new int[n];
		Arrays.fill(class1, 101);
		Arrays.fill(class2, 101);
		Arrays.fill(class3, 101);
		Arrays.fill(class4, 101);
		int one=0;
		int two=0;
		int three=0;
		int four=0;
		for(int i=0;i<n;i++){
			int temp = sc.nextInt();
			if(temp == 1){
				class1[one] = sc.nextInt();
				one++;
			}else if(temp == 2){
				class2[two] = sc.nextInt();
				two++;
			}else if(temp == 3){
				class3[three] = sc.nextInt();
				three++;
			}else if(temp == 4){
				class4[four] = sc.nextInt();
				four++;
			}
		}
		Arrays.sort(class1);
		Arrays.sort(class2);
		Arrays.sort(class3);
		Arrays.sort(class4);
		for(int i=0;i<one;i++){
			System.out.println("1 "+class1[i]);
		}
		for(int i=four-1;i>=0;i--){
			System.out.println("4 "+class4[i]);
		}
		for(int i=two-1;i>=0;i--){
			System.out.println("2 "+class2[i]);
		}
		for(int i=0;i<three;i++){
			System.out.println("3 "+class3[i]);
		}
		
	}
}
