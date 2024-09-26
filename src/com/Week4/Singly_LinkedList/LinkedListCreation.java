package com.Week4.Singly_LinkedList;

/**
 * 1. Linked List is a linear data structure; 2. It maintains the insertion
 * order 3. Unlike an array linked list is not stored in the contiguous memory
 * allocation pattern like Array, 4. Homogeneous , only one type of elements can
 * be added; 5. Also ArrayList is static data structure; 6. LinkedList Dynamic
 * Data Structure . 7. Type of LinkedList 1. Singly LinkedList 2. Doubly
 * LinkedList 3. Circular LinkedList
 * 
 * 
 * 
 * 
 * 
 */

class ListNode {
	int data;
	ListNode next;

	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}

}

public class LinkedListCreation {

	// private static Node head = null;

	// Insert a node at start:
	public static ListNode insertAtStart(int data, ListNode head) {

		ListNode newNode = new ListNode(data);

		if (head == null) {
			head = newNode;
			return head;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}

	// Insert a node at end:
	public static ListNode insertAtEnd(int data, ListNode head) {

		ListNode newNode = new ListNode(data);

		if (head == null) {
			head = newNode;
			return head;
		}
		ListNode ref = head;
		while (ref.next != null) {
			ref = ref.next;
		}
		ref.next = newNode;
		return head;
	}

	// Print values iterative:

	public static void printValue(ListNode head) {
		if (head == null) {
			return;
		}
		ListNode ref = head;
		while (ref != null) {
			System.out.print(ref.data + " ->");
			ref = ref.next;
		}

	}
	
	public static ListNode reverseLinkedList(ListNode head) {
		
		if(head == null || head.next ==null) {
			return head;
		}
		
		ListNode previous = null;
		ListNode current = head; 
		
		while(current != null) {
			ListNode fwd = current.next; 
			current.next = previous; 
			previous = current; 
			current = fwd; 			
		}
		
		return previous;
	}

	public static void main(String[] args) {
		ListNode head1 = null;
		head1= LinkedListCreation.insertAtStart(10, head1);
		head1 = LinkedListCreation.insertAtStart(20, head1);
		head1 = LinkedListCreation.insertAtStart(30, head1);
		head1 = LinkedListCreation.insertAtStart(40, head1);

		LinkedListCreation.printValue(head1);
		System.out.println("\n+++++++++++++++++++++++++++");
		ListNode head2 = null;
		head2 = LinkedListCreation.insertAtEnd(50, head2);
		head2 = LinkedListCreation.insertAtEnd(60, head2);
		head2 = LinkedListCreation.insertAtEnd(70, head2);
		LinkedListCreation.printValue(head2);
		
		System.out.println("\n"+"Reverse>>>>>");
		head2 = LinkedListCreation.reverseLinkedList(head2);
		LinkedListCreation.printValue(head2);

	}

}
