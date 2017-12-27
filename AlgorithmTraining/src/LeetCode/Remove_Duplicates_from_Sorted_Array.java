package LeetCode;

public class Remove_Duplicates_from_Sorted_Array {
	public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }
}
