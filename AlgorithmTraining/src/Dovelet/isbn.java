package Dovelet;
import java.util.*;
public class isbn {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum=0;
		int cnt=10;
		int point=-1;
		for(char c : s.toCharArray()){
			if(c<=57 && c>=48){
				sum+=(int)(c-48) * cnt;
			}else if(c=='X'){
				sum+=10;
			}else if(c=='?'){
				point=cnt;
			}
			cnt--;
		}
		int aa=-1;
		if(point!=1){
			for(int i=0;i<10;i++){
				if((sum+(point*i))%11 == 0){
					System.out.println(i);
					aa=1;
					break;
				}
			}
			if(aa<0)System.out.println(aa);
		}else{
			for(int i=0;i<=10;i++){
				if((sum+(point*i))%11 == 0){
					if(i==10)System.out.println("X");
					else System.out.println(i);
					aa=1;
					break;
				}
			}
			
			if(aa<0)System.out.println(aa);
		}
		
	}
}
