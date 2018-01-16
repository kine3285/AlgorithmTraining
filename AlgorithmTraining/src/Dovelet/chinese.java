package Dovelet;
import java.util.*;
public class chinese {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int r3=sc.nextInt();
		
		long result =0;
		int a1=b*c;
		while(true){
			if(a1%a == r1){
				break;
			}
			a1+=b*c;
		}
		int b1=a*c;
		while(true){
			if(b1%b == r2){
				break;
			}
			b1+=a*c;
		}
		int c1=a*b;
		while(true){
			if(c1%c == r3){
				break;
			}
			c1+=a*b;
		}
		result = a1+b1+c1+(a*b*c);
		int k=a*b*c;
		while(result>0){
			result = result-k;
		}
		System.out.println(result+k);
	}
}
