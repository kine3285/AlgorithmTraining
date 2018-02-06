package Dovelet;
import java.util.*;
public class secret {
	public static char checker(String s){
		int cnt=0;
		int min=Integer.MAX_VALUE;
		char result='Z';
		String temp="000000";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='A';
		}
		cnt=0;
		temp="001111";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='B';
		}
		cnt=0;
		temp="010011";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='C';
		}
		cnt=0;
		temp="011100";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='D';
		}
		cnt=0;
		temp="100110";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='E';
		}
		cnt=0;
		temp="101001";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='F';
		}
		cnt=0;
		temp="110101";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='G';
		}
		cnt=0;
		temp="111010";
		for(int i=0;i<6;i++){
			if(s.charAt(i)!=temp.charAt(i))cnt++;
		}
		if(cnt<2 && cnt<min){
			min=cnt;
			result='H';
		}
		if(result == 'Z')
			return '!';
		
			return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int loc=0;
		StringBuilder result = new StringBuilder();
		for(int j=0;j<n;j++){
			loc=j*6;
			StringBuilder sb = new StringBuilder();
			for(int i=loc;i<loc+6;i++){
				sb.append(s.charAt(i));
			}
			if(sb.toString() == "000000"){
				result.append('A');
			}else if(sb.toString().equals("001111")){
				result.append('B');
			}else if(sb.toString().equals("010011")){
				result.append('C');
			}else if(sb.toString().equals("011100")){
				result.append('D');
			}else if(sb.toString().equals("100110")){
				result.append('E');
			}else if(sb.toString().equals("101001")){
				result.append('F');
			}else if(sb.toString().equals("110101")){
				result.append('G');
			}else if(sb.toString().equals("111010")){
				result.append('H');
			}else{
				char check = checker(sb.toString());
				if(check == '!'){
					result = new StringBuilder();
					result.append(j+1);
					break;
				}else{
					result.append(check);
				}
			}
		}
		System.out.println(result);
	}
}
