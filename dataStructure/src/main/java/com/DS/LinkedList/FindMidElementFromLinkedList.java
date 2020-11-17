package com.DS.LinkedList;

public class FindMidElementFromLinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		push(10);
		push(20);
		push(20);
		push(40);
		push(10);
		push(60);
		push(10);
		display();
		findMidNode();
		countOccurence(20);
		
		
	}
	public static void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	public static void display() {
		Node current = head;
		if(head == null) {
			System.out.println("Empty List");
			return;
		}
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
			
		}
	}
	public static int findMidNode() {
		if(head == null) {
			System.out.println("Empty list");
			return 0;
		}
		int count = 0;
		Node mid = head;
		Node current = head;
		while(current != null) {
			if((count %2 ) == 1) {
				mid = mid.next;
			}
			count++;
			current = current.next;
		}
		if(mid != null) {
			System.out.println("Middle Element is: "+mid.data);
		}
		return mid.data;
	}
	public static int countOccurence(int key) {
		if(head == null) {
			System.out.println("Empty list");
			return 0;
		}
		int count  = 0 ; 
		Node current = head;
		while(current != null) {
			if(current.data == key) {
				count++;
			}
			current = current.next;
			
		}
		System.out.println("Count: "+count);
		return count;
	}

}
