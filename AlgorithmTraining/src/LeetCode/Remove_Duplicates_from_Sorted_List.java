package LeetCode;

public class Remove_Duplicates_from_Sorted_List {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		head.next = deleteDuplicates(head.next);
		if (head.next.val == head.val) {
			return head.next;
		}

		return head;
	}
}
