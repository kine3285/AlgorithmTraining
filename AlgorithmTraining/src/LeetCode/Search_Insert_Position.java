package LeetCode;

public class Search_Insert_Position {
	public int searchInsert(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (target < nums[i]) {
				return i;
			} else if (target == nums[i]) {
				return i;
			} else if (i == nums.length - 1) {
				return ++i;
			}
		}
		return 999;
	}
}
