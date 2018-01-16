package Dovelet;
import java.util.*;
public class quadratic {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		double result1=0;
		double result2=0;
		if(b*b-4*a*c<0){
			System.out.println("0");
		}else if(b*b-4*a*c == 0){
			result1 = (-1)*b/(2*a);
			System.out.println("1");
			if(result1 == 0)result1 = 0;
			System.out.printf("%.3f",result1);
		}else{
			result1 = ((-1)*b+Math.sqrt(b*b-4*a*c))/2*a;
			result2 = ((-1)*b-Math.sqrt(b*b-4*a*c))/2*a;
			System.out.println("2");
			System.out.printf("%.3f %.3f", Math.min(result1, result2), Math.max(result1, result2));
		}
	}
}
