package LeetCode;
import java.io.*;
import java.util.*;
public class Generate_Parentheses {
	public static List<String> generateParenthesis(int n) {
	     List<String> res = new ArrayList<>();
	     helper(res, new StringBuilder(), 0, 0, n);
	     return res;
	}

	private static void helper(List<String> res, StringBuilder sb, int open, int close, int n) {
	    if(open == n && close == n) {
	        res.add(sb.toString());
	        return;
	    }
	    
	    if(open < n) {
	        sb.append("(");
	        helper(res, sb, open+1, close, n);
	        sb.setLength(sb.length()-1);
	    } 
	    if(close < open) {
	        sb.append(")");
	        helper(res, sb, open, close+1, n);
	        sb.setLength(sb.length()-1);
	    }
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(generateParenthesis(n));
	}

}
