package com.Week4.Singly_LinkedList;

/**
 * 19. Remove Nth Node From End of List Given the head of a linked list, remove
 * the nth node from the end of the list and return its head. Input: head =
 * [1,2,3,4,5], n = 2 Output: [1,2,3,5] Example 2:
 * 
 * Input: head = [1], n = 1 Output: []
 *
 */
public class RemoveNthFromEndReverse {

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		LinkedListCreation.reverseLinkedList(head);
		

		return head;

	}
	
	public static void main(String[] args) {
		
		ListNode head1 = null;
		/*head1 = LinkedListCreation.insertAtStart(5, head1);
		head1 = LinkedListCreation.insertAtStart(4, head1);
		head1 = LinkedListCreation.insertAtStart(3, head1);*/
		head1 = LinkedListCreation.insertAtStart(2, head1);
		head1 = LinkedListCreation.insertAtStart(1, head1);
		LinkedListCreation.printValue(head1);
		System.out.println("\n");
		head1 = removeNthFromEnd(head1, 2);
		LinkedListCreation.printValue(head1);
		
	}
}
