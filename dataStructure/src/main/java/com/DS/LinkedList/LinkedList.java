package com.DS.LinkedList;

import java.util.Scanner;

public class LinkedList {
	static Node head;
	static boolean isRunning;
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
			
		}
	}

	public static void main(String[] args) {
		System.out.println("***************Linked list Application********************");
		isRunning = true;
		printOptions();
		while(isRunning) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 0:
				 System.out.println("********All operation********");
				 printOptions();
				 break;
			case 1:
				System.out.println("Enter value:");
				int data = sc.nextInt();
				push(data);
				break;
			case 2:
				System.out.println("enter Value");
				int data2 = sc.nextInt();
				append(data2);
				break;
			case 3: 
				if (head != null) {
					System.out.println("Enter node position");
					int prevNode = sc.nextInt();
					System.out.println("Enter value:");
					int data3 = sc.nextInt();
					insertAfter(prevNode, data3);
				}else {
					System.out.println("List is empty");
				}
				
				break;
			case 4:
				deleteFirst();
				break;
			case 5:
				deleteLastNode();
				break;
			case 6:
				System.out.println("Please enter position");
				int pos = sc.nextInt();
				deleteNode(pos);
				break;
			case 7:
				deleteList();
				break;
			case 8:
				int length = findlength();
				System.out.println("Length of List: "+length);
				break;
			case 9:
				System.out.println("Enter element you want to search");
				int num = sc.nextInt();
				boolean isPresent = searchElement(num);
				if(isPresent) {
					System.out.println("given element present in list");
				}else {
					System.out.println("Given element not in list");
				}
				break;
			case 10:
				System.out.println("Please enter nth value");
				int n = sc.nextInt();
				searchNthNode(n);
				break;
			case 11:
				System.out.println("Enter nth value");
				int num1 = sc.nextInt();
				searchFromEnd(num1);
				break;
			case 12:
				findMiddleElement();
				break;
			case 90:
				printLinkedList();
				break;
			case 99:
				isRunning = false;
				System.out.println("Exit application");
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			
		}
	
	}
	private static void findMiddleElement() {
		Node cur = head;
		int count = 0;
		if(head == null) {
			System.out.println("Empty List");
			return;
		}
		while(cur != null) {
			count++;
			cur = cur.next;
		}
		int length = count;
		cur = head;
		for(int i = 1;i<length/2;i++) {
			cur = cur.next;
		}
		System.out.println(cur.data);
		
		
	}
	private static void searchFromEnd(int num1) {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		int count = 0 ;
		Node current = head;
		while(current !=null) {
			count++;
			current = current.next;
		}
		
		int length = count;
		if(length < num1) {
			System.out.println("Invalid input");
			return;
		}
		current = head;
		for(int i = 1;i<length-num1+1;i++) {
			current = current.next;
		}
		System.out.println(current.data);
	}
	private static void printOptions() {
		System.out.println("1\t insert element in list");
		System.out.println("2\t insert element in list at the beigning");
		System.out.println("3\t insert element in list after given Node");
		System.out.println("4\t Delete first node from list");
		System.out.println("5\t Delete last node from list");
		System.out.println("6\t Delete Node from given position");
		System.out.println("7\t Delete complete List");
		System.out.println("8\t Find the length of list");
		System.out.println("9\t search an element");
		System.out.println("10\t Find nth Node in list");
		System.out.println("11\t Find nth node from end side");
		System.out.println("12\t find middle element in list ");
		System.out.println("90\t print element in list");
		System.out.println("99\t Exit from application");
	}
	private static void searchNthNode(int n) {
		int count = 0 ;
		Node currentNode = head;
		while(currentNode != null) {
			if(count == n) {
				System.out.println(n+"th index value is: "+currentNode.data);
				return;
			}
			currentNode = currentNode.next;
			count++;
			
		}
		
	}
	private static boolean searchElement(int num) {
		if(head == null) {
			System.out.println("List is empty");
			return false;
		}
		Node curNode = head;
		while(curNode != null) {
			if(curNode.data == num) {
				return true;
			}
			curNode = curNode.next;
		}
		return false;
	}
	private static int findlength() {
		if(head == null) {
			System.out.println("List is empty");
			return 0;
		}
		Node currentNode = head;
		int count = 0;
		while(currentNode != null) {
			count++;
			currentNode  = currentNode.next;
		}
		return count;
		
	}
	private static void deleteList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		head = null;
		System.out.println("List Deleted!");
		
	}
	private static void deleteNode(int pos) {
		if(head == null) {
			System.out.println("List is Empty, Cannot delete Node");
			return;
		}
		Node currentNode = head;
		if(pos == 0) {
			head = currentNode.next;
			return;
		}
		for(int i = 0 ; currentNode != null && i<pos-1;i++) {
			currentNode = currentNode.next;
		}
		if(currentNode == null || currentNode.next == null) {
			System.out.println("Given Position is not present in list");
			return;
		}
		Node next = currentNode.next.next;
		currentNode.next = next;
		
		
	}
	private static void deleteLastNode() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node secondLast = head;
		while(secondLast.next.next!=null) {
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		
		
	}
	private static void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Deleting first node from list");
		head = head.next;
		
	}
	private static void printLinkedList() {
		if(head == null) {
			System.out.println("List is Empty!");
		}else {
			Node cuNode = head;
			System.out.println("Node present in List are:");
			while(cuNode != null) {
				System.out.println(cuNode.data);
				cuNode = cuNode.next;
			}
		}
		
	}
	private static void push(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node currentNode = head;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
		
	}
	private static void append(int data) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
				
	}
	
	private static void insertAfter(int prev_Node, int data) {
		if(head == null ) {
			System.out.println("List is not valid!");
			return;
		}
		Node currentNode = head;
		Node newNode = new Node(data);
		int count = 0;
		while(currentNode != null) {
			count++;
			if(count == prev_Node) {
				newNode.next = currentNode.next;
				currentNode.next = newNode;
				return;
			}
			
			currentNode = currentNode.next;
		}
	}

}
