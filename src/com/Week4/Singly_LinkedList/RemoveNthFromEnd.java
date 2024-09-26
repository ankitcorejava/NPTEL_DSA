package com.Week4.Singly_LinkedList;

/**
 * 19. Remove Nth Node From End of List Given the head of a linked list, remove
 * the nth node from the end of the list and return its head. Input: head =
 * [1,2,3,4,5], n = 2 Output: [1,2,3,5] Example 2:
 * 
 * Input: head = [1], n = 1 Output: []
 *
 */
public class RemoveNthFromEnd {

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		int currentCnt = 0;
		int totalCnt = 0;
		if (head == null) {
			return head;
		}
		if (head.next == null && n == 1) {
			return head.next;
		}
		ListNode prev = null;
		ListNode ref1 = head;
		ListNode ref2 = head;

		while (ref1 != null) {
			//prev = ref1;
			ref1 = ref1.next;

			totalCnt++;
		}
		
		if(totalCnt == n) {
			return head.next;
		}
		

		while (currentCnt != (totalCnt - n - 1)) {
			ref2 = ref2.next;
			currentCnt++;
		}
		
		
		ref2.next = ref2.next.next;

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
