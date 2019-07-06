package ds;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 				------------------------ BINARY TREE ---------------------------
 * 				max of two child nodes (Left child + Right Child)
 * 				
 * 
 * 
 * */
public class BinaryTree {
	
	BTNode root;
	
	class BTNode {
		
		private int data;
		private BTNode left;
		private BTNode right;
		
		public BTNode() {
			left = null;
			right = null;
			data = 0;
		}
		
		public BTNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
	
	public BinaryTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void insert(int data) {
		root = insert(root,data);
	}
	
	public BTNode insert(BTNode node,int data) {
		
		if (node == null)
			node = new BTNode(data);
		else {
			if (node.left==null) {
				node.left = insert(node.left,data);
			}
			else if (node.right==null){
				node.right = insert(node.right,data);
			}
			else {
				if (Math.random()*10 < 5)
					node.right = insert(node.right,data);
				else
					node.left = insert(node.left,data);
			}
		}
		return node;
	}
	
	public void insertbs(int data) {
		root = insertbs(root,data);
	}
	
	public BTNode insertbs(BTNode node,int data) {
		if (node == null)
			node = new BTNode(data);
		else {
			if (data < node.data)
				node.left = insertbs(node.left,data);
			else if (data > node.data)
				node.right = insertbs(node.right,data);
		}
		return node;
	}
	
	public int countNodes() {
		return countNodes(root);
	}
	public int countNodes(BTNode node) {
		if (node == null)
				return 0;
		else {
			int count = 1;
			count += countNodes(node.left);
			count += countNodes(node.right);
			return count;
		}
	}
	
	public boolean search(int data) {
		return search(root,data);						// Because we can't pass root node as argument in the search so we have to call the over-rided
//														recursive function by manually passing the root first
	}
	
	public boolean search(BTNode node, int data) {				// Then the parameter in node changes to sub-nodes after root.
		
		if (node.data == data)
			return true;
		if (node.left!=null) {						// Looking into the Left Child of Node
			if(search(node.left,data))				// Looking into the Left child's sub-child nodes recursively
					return true;
		}
		
		if (node.right!=null) {					// Looking into the Left Child of Node
			if (search(node.right,data))			// Looking into the Left child's sub-child nodes recursively
				return true;
		}
		
		return false;
	}
	
	public void postorder() {
		System.out.println("Postorder Traversal: ");
		if(root.left!=null) {
			System.out.println("root.left: "+root.left.data);
			if(root.left.left!=null)
				System.out.println("root.left.left: "+root.left.left.data);
		}
			
		postorder(root);
	}
	
	public void postorder(BTNode node) {
		if (node!=null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	public void inorder() {
		System.out.println("\nInorder Traversal: ");
		inorder(root);
	}
	
	public void inorder(BTNode node) {
		if (node!=null) {
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
		}
	}
	
	public void preorder() {
		System.out.println("\nPreorder Traversal: ");
		preorder(root);
	}
	
	public void preorder(BTNode node) {
		if (node!=null) {
			System.out.print(node.data+" ");
			inorder(node.left);
			inorder(node.right);
		}
	}
	
	public void levelOrder() {
		System.out.print("\n[");
		levelOrder(root);
		System.out.print("]");
	}
	
	public void levelOrder(BTNode node) {
		Queue<BTNode> q = new LinkedList<>();
		
		q.add(node);
		StringBuffer sb = new StringBuffer();
		sb.append(node.data+" ");
		
		while(!q.isEmpty()) {
			BTNode temp = q.poll();
			
//			System.out.print(temp.data+",");
			BTNode l = null;
			BTNode r = null;
			
			if (temp.left!=null) {
				q.add(temp.left);
				l = temp.left;
			}
			
			if(temp.right!=null) {
				q.add(temp.right);
			    r = temp.right;
			}
			if (r!=null)
				sb.insert(0,r.data+" ");
			if (l!=null)
				sb.insert(0, l.data+" ");
		}
		System.out.println(sb);
	}
	
//				Level Order Spiral Traversal
	
//	public void spiralTraverse() {
//		
//		Stack<BTNode> s = new Stack<BTNode>(20);
//		
//		if (root!=null) {
//			System.out.println(root.data);
//		}
//		else
//			return;
//		
////		BTNode node = root;
//		int level = 0;
////		s.push(root.left);
////		s.push(root.right);
//		
//		BTNode temp = root;
//		s.push(root);
//		
//		while (temp.left!=null && temp.right!=null && temp!=null) {
//			
//			if ( level %2==0) {
//				temp = s.pop();
//				System.out.println(temp.left.data);		
//				s.push(temp.left);
//				System.out.println(temp.right.data);
//				s.push(temp.right);
//				level++;
//			}
//			else {
//				temp = s.pop();
//				System.out.println(temp.right.data);
//				s.push(temp.right);
//				System.out.println(temp.left.data);		
//				s.push(temp.left);
//				level++;
//			}
//		}
//	}
}
