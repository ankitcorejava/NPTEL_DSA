package com.Week4.Singly_LinkedList;

/**
 * 92. Reverse Linked List II
 * https://leetcode.com/problems/reverse-linked-list-ii/description/?envType=problem-list-v2&envId=linked-list
 * 
 * Given the head of a singly linked list and two integers left and right where
 * left <= right, reverse the nodes of the list from position left to position
 * right, and return the reversed list. Input: head = [1,2,3,4,5], left = 2,
 * right = 4 Output: [1,4,3,2,5] Example 2: Input: head = [5], left = 1, right =
 * 1 Output: [5]
 */
public class ReverseLinkedListII {
	public static ListNode reverseBetween(ListNode head, int left, int right) {

		// Find the 1st half list:
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode prevPart1 = dummy;
		ListNode prevPartRef = prevPart1;
		ListNode currentPart1 = head;
		int cnt = 0;
		while (currentPart1 != null && cnt != left - 1) {
			prevPart1 = prevPart1.next;
			currentPart1 = currentPart1.next;
			cnt++;
		}
		prevPart1.next = null;
		System.out.println("\n" + "============ 1st half list=============");
		LinkedListCreation.printValue(prevPartRef);

		// Find the mid list ,which needs to be reversed:
		// Setting the pointer for 2nd half;
		//int rightCnt = 1;
		ListNode toBeRevPart2 = currentPart1;
		ListNode toBeRevPart2Ref = toBeRevPart2;

		while (toBeRevPart2 != null && cnt != right-1) {
			toBeRevPart2 = toBeRevPart2.next;
			cnt++;
		}
		ListNode finalPart = null;
		if (toBeRevPart2 != null) {
			finalPart = toBeRevPart2.next;
		}
		if (toBeRevPart2 != null) {
			toBeRevPart2.next = null;
		}
		System.out.println("\n" + "============mid list=============");
		LinkedListCreation.printValue(toBeRevPart2Ref);
		toBeRevPart2Ref = reverseLinkedList(toBeRevPart2Ref);

		System.out.println("\n" + "============mid list Reverse=============");
		LinkedListCreation.printValue(toBeRevPart2Ref);

		// Find the last list:
		// Setting the pointer for last half;

		System.out.println("\n" + "============finalPart=============");
		LinkedListCreation.printValue(finalPart);

		prevPart1.next = toBeRevPart2Ref;
		ListNode ref = toBeRevPart2Ref;
		while (ref != null && ref.next != null) {
			ref = ref.next;
		}
		if (ref != null) {
			ref.next = finalPart;
		}

		System.out.println("\n" + "============Complete OutPut =============");
		LinkedListCreation.printValue(prevPartRef.next);

		return prevPartRef.next;

	}

	public static ListNode reverseLinkedList(ListNode head) {

		ListNode prev = null;
		ListNode current = head;
		while (current != null) {
			ListNode fwd = current.next;
			current.next = prev;
			prev = current;
			current = fwd;
		}

		return prev;

	}

	public static void main(String[] args) {

		ListNode head1 = null;
		/*
		 * head1 = LinkedListCreation.insertAtStart(7, head1); head1 =
		 * LinkedListCreation.insertAtStart(6, head1); head1 =
		 * LinkedListCreation.insertAtStart(5, head1); head1 =
		 * LinkedListCreation.insertAtStart(4, head1);
		 */
		head1 = LinkedListCreation.insertAtStart(5, head1);
		head1 = LinkedListCreation.insertAtStart(3, head1);
		LinkedListCreation.printValue(head1);
		/*
		 * System.out.println(""); head1 = reverseLinkedList(head1);
		 * LinkedListCreation.printValue(head1);
		 */
		head1 = reverseBetween(head1, 1, 2);
		System.out.println("");
		// LinkedListCreation.printValue(head1);
	}
}
