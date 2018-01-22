package Dovelet;

public class rev {
	public static int reverse(int n){
		String s = Integer.toString(n);
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : arr){
			sb.insert(0, c);
		}
		s = sb.toString();
		int result=Integer.parseInt(s);
		
		return result;
	}
	public static boolean checker(int n){
		String s = Integer.toString(n);
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length/2;i++){
			if(arr[i] != arr[arr.length-1-i])return false;
		}
		return true;
	}
	public static void main(String[] args){
		for(int i=10;i<100001;i++){
			int re = reverse(i);
			boolean ck = checker(re+i);
			if(ck)System.out.println(i);
		}
	}
}
