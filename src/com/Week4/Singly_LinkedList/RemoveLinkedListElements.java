package com.Week4.Singly_LinkedList;

/**
 * 203. Remove Linked List Elements
 * 
 * Given the head of a linked list and an integer val, remove all the nodes of
 * the linked list that has Node.val == val, and return the new head.
 * 
 * Input: head = [1,2,6,3,4,5,6], val = 6 Output: [1,2,3,4,5] Input: head =
 * [7,7,7,7], val = 7 Output: []
 */
public class RemoveLinkedListElements {

	public static ListNode removeElements(ListNode head, int val) {

		if (head == null ) {
			return null;
		}

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prev = dummy;

		ListNode current = head;

		while (current != null) {

			if (current.data == val) {
				prev.next = current.next;//skipping nodes
			} else {
				prev = prev.next;
			}
			current = current.next;
		}

		return dummy.next;

	}

	public static void main(String[] args) {

		ListNode head1 = null;
		head1 = LinkedListCreation.insertAtStart(3, head1);
		head1 = LinkedListCreation.insertAtStart(4, head1);
		head1 = LinkedListCreation.insertAtStart(4, head1);
		head1 = LinkedListCreation.insertAtStart(3, head1);
		head1 = LinkedListCreation.insertAtStart(3, head1);
		head1 = LinkedListCreation.insertAtStart(2, head1);
		head1 = LinkedListCreation.insertAtStart(3, head1);
		LinkedListCreation.printValue(head1);
		head1 = removeElements(head1, 3);
		System.out.println("");
		LinkedListCreation.printValue(head1);
	}

}
