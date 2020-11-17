package com.DS.Tree;

public class TreeImplementation {
	private Node root;
	
	public TreeImplementation(int data) {
		root = new Node(data);
	}
	public TreeImplementation() {
		root = null;
	}
	
	public static void main(String[] args) {
		
		TreeImplementation tree = new TreeImplementation();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Inorder");
		tree.inorder(tree.root);
		System.out.println(" ");
		tree.mirror(tree.root);
		tree.inorder(tree.root);
		
	}
	
	private Node mirror(Node root) {
		if(root == null) {
			return null;
		}
		Node left = mirror(root.left);
		Node right  = mirror(root.right);
		root.left = right;
		root.right = left;
		
		return root;
	}
	private void inorder(Node root) {
		if(root == null) {
			return ;
		}
		inorder(root.left);
		System.out.println(root.data+" ");
		inorder(root.right);
	}


}
