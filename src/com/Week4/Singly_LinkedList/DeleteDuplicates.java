package com.Week4.Singly_LinkedList;

/**
 * 83. Remove Duplicates from Sorted List
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=problem-list-v2&envId=linked-list
 * Input: head = [1,1,2] Output: [1,2]
 * 
 * Input: head = [1,1,2,3,3] Output: [1,2,3]
 */
public class DeleteDuplicates {

	public static ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}
		ListNode ref = head;
		ListNode refPointer = ref;
		while (ref != null && ref.next != null) {
			while ((ref != null && ref.next != null) && (ref.data == ref.next.data)) {
				ref.next = ref.next.next;
			}
			ref = ref.next;
		}
		return refPointer;
	}

	public static void main(String[] args) {

		ListNode head1 = null;
		head1 = LinkedListCreation.insertAtStart(2, head1);
		head1 = LinkedListCreation.insertAtStart(1, head1);
		// head1 = LinkedListCreation.insertAtStart(1, head1);
		head1 = LinkedListCreation.insertAtStart(1, head1);
		LinkedListCreation.printValue(head1);
		head1 = deleteDuplicates(head1);
		System.out.println("");
		LinkedListCreation.printValue(head1);
	}
}
