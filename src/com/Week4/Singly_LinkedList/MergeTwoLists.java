package com.Week4.Singly_LinkedList;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/?envType=problem-list-v2&envId=linked-list
 * 21. Merge Two Sorted Lists Easy Topics Companies You are given the heads of
 * two sorted linked lists list1 and list2.
 * 
 * Merge the two lists into one sorted list. The list should be made by splicing
 * together the nodes of the first two lists.
 * 
 * Return the head of the merged linked list. Input: list1 = [1,2,4], list2 =
 * [1,3,4] Output: [1,1,2,3,4,4]
 */
public class MergeTwoLists {

	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		ListNode dummy = new ListNode(-1);
		ListNode ref = dummy;
		ListNode ref1 = list1;
		ListNode ref2 = list2;

		while (ref1 != null && ref2 != null) {

			if (ref1.data > ref2.data) {
				dummy.next = ref2;
				ref2 = ref2.next;
			} else {
				dummy.next = ref1;
				ref1 = ref1.next;
			}
			dummy = dummy.next;
		}

		// if ref1 is still not null ?
		if (ref1 != null) {
			dummy.next = ref1;
		}

		// if ref2 is still not null ?
		if (ref2 != null) {
			dummy.next = ref2;
		}

		return ref;

	}

	public static void main(String[] args) {

		ListNode head1 = null;
		head1 = LinkedListCreation.insertAtStart(40, head1);
		head1 = LinkedListCreation.insertAtStart(30, head1);
		head1 = LinkedListCreation.insertAtStart(20, head1);
		head1= LinkedListCreation.insertAtStart(10, head1);
		LinkedListCreation.printValue(head1);
		System.out.println("\n+++++++++++++++++++++++++++");
		ListNode head2 = null;
		head2 = LinkedListCreation.insertAtStart(70, head2);
		head2 = LinkedListCreation.insertAtStart(45, head2);
		head2 = LinkedListCreation.insertAtStart(30, head2);
		head2 = LinkedListCreation.insertAtStart(25, head2);

		LinkedListCreation.printValue(head2);
		
		head1 = mergeTwoLists(head1,head2);
		System.out.println("");
		LinkedListCreation.printValue(head1);
	}
}
