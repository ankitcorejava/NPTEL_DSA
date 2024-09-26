package com.Week4.Singly_LinkedList;

/**
 * 2. Add Two Numbers You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order, and each of
 * their nodes contains a single digit. Add the two numbers and return the sum
 * as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * @author ankitkb
 *
 */
public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		//l1 = LinkedListCreation.reverseLinkedList(l1);
		//l2 = LinkedListCreation.reverseLinkedList(l2);
		int carry = 0;
		ListNode finalNode = new ListNode(0);

		while (l1 != null && l2 != null) {

			int sum = Math.addExact(l1.data, l2.data) + carry;
			carry = 0;
			if (sum < 10) {
				// finalNode.next.data = sum;
				LinkedListCreation.insertAtEnd(sum, finalNode);
			} else {
				carry = sum / 10;
				LinkedListCreation.insertAtEnd((sum % 10), finalNode);
			}
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			int sum = Math.addExact(l1.data, carry);
			carry = 0;
			if (sum < 10) {
				// finalNode.next.data = sum;
				LinkedListCreation.insertAtEnd(sum, finalNode);
			} else {
				carry = sum / 10;
				LinkedListCreation.insertAtEnd((sum % 10), finalNode);
			}
			l1 = l1.next;
		}
		while (l2 != null) {
			int sum = Math.addExact(l2.data, carry);
			carry = 0;
			if (sum < 10) {
				// finalNode.next.data = sum;
				LinkedListCreation.insertAtEnd(sum, finalNode);
			} else {
				carry = sum / 10;
				LinkedListCreation.insertAtEnd((sum % 10), finalNode);
			}
			l2 = l2.next;
		}
		if(carry != 0) {
			LinkedListCreation.insertAtEnd(carry, finalNode);
		}

		return finalNode;

	}

	public static void main(String[] args) {

		ListNode head1 = null;
		head1 = LinkedListCreation.insertAtStart(9, head1);
		head1 = LinkedListCreation.insertAtStart(9, head1);
		head1 = LinkedListCreation.insertAtStart(9, head1);
		head1 = LinkedListCreation.insertAtStart(9, head1);
		head1 = LinkedListCreation.insertAtStart(9, head1);
		head1 = LinkedListCreation.insertAtStart(9, head1);
		head1 = LinkedListCreation.insertAtStart(9, head1);
		//head1 = LinkedListCreation.insertAtStart(8, head1);

		LinkedListCreation.printValue(head1);
		System.out.println("\n+++++++++++++++++++++++++++");
		ListNode head2 = null;
		head2 = LinkedListCreation.insertAtEnd(9, head2);
		head2 = LinkedListCreation.insertAtEnd(9, head2);
		head2 = LinkedListCreation.insertAtEnd(9, head2);
		head2 = LinkedListCreation.insertAtEnd(9, head2);
		LinkedListCreation.printValue(head2);

		/*
		 * System.out.println("\n"+"Reverse  head1 >>>>>"); head1 =
		 * LinkedListCreation.reverseLinkedList(head1);
		 * LinkedListCreation.printValue(head1);
		 */

		/*
		 * System.out.println("\n"+"Reverse  head2>>>>>"); head2 =
		 * LinkedListCreation.reverseLinkedList(head2);
		 * LinkedListCreation.printValue(head2);
		 */
		System.out.println("\n");
		ListNode head3 = AddTwoNumbers.addTwoNumbers(head1, head2);
		LinkedListCreation.printValue(head3.next);

	}

}
