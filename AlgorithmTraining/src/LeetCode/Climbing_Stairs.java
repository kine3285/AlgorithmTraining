package LeetCode;

public class Climbing_Stairs {
	public int climbStairs(int n) {
		int a = 1, b = 1;
		while (n-- > 0)
			a = (b += a) - a;
		return a;
	}
}
