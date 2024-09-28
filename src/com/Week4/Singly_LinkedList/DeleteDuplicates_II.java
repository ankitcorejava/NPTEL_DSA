package com.Week4.Singly_LinkedList;

/**
 * 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=problem-list-v2&envId=linked-list
 * Input: head = [1,1,2] Output: [1,2]
 * 
 * Input: head = [1,1,2,3,3] Output: [1,2,3]
 */
public class DeleteDuplicates_II {

	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;
		ListNode current = head;

		while (current != null) {

			if ((current != null && current.next != null) && (current.data == current.next.data)) {

				while ((current != null && current.next != null) && (current.data == current.next.data)) {

					current = current.next;
				}
				prev.next = current.next;

			} else {
				prev = prev.next;

			}
			current = current.next;
		}

		return dummy.next;
	}

	public static void main(String[] args) {

		ListNode head1 = null;
		head1 = LinkedListCreation.insertAtStart(5, head1);
		head1 = LinkedListCreation.insertAtStart(4, head1);
		head1 = LinkedListCreation.insertAtStart(4, head1);
		head1 = LinkedListCreation.insertAtStart(3, head1);
		head1 = LinkedListCreation.insertAtStart(3, head1);
		head1 = LinkedListCreation.insertAtStart(2, head1);
		head1 = LinkedListCreation.insertAtStart(1, head1);
		LinkedListCreation.printValue(head1);
		head1 = deleteDuplicates(head1);
		System.out.println("");
		LinkedListCreation.printValue(head1);
	}
}
