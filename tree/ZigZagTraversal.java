package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class BTree{
	
	Node root;
	
	static class Node{
		int data;
		Node left;
		Node right;
	}
	
	static Node newNode(int data) {
		Node temp = new BTree.Node();
		
		temp.data = data;
		
		return temp;
	}
}

public class ZigZagTraversal {

	public static void main(String[] args) {
		
		BTree.Node root = BTree.newNode(1);  //                   1
		root.left = BTree.newNode(2);        //               2       3
		root.right = BTree.newNode(3);       //            4    5    6  7 
		root.left.left = BTree.newNode(4);   //          8  9    10      11
		root.left.right = BTree.newNode(5);
		root.right.left = BTree.newNode(6);
		root.right.right = BTree.newNode(7);
		root.left.left.left = BTree.newNode(8);
		root.left.left.right = BTree.newNode(9);
		root.left.right.right = BTree.newNode(10);
		root.right.right.right = BTree.newNode(11);
		
		// Zig-zag would be 1,2,3,7,6,5,4
		
		Stack<BTree.Node> s1 = new Stack<>();
		Stack<BTree.Node> s2 = new Stack<>();
		s1.push(root);
		
		while (!s1.isEmpty() || !s2.isEmpty()) {
			
			while (!s1.isEmpty()) {
				BTree.Node temp = s1.pop();
				System.out.print(temp.data+" ");
				
				if (temp.left!=null) {
					s2.push(temp.left);
				}
				if (temp.right!=null) {
					s2.push(temp.right);
				}
			}
			
			while (!s2.isEmpty()) {
				BTree.Node temp = s2.pop();
				System.out.print(temp.data+" ");
				
				if (temp.right!=null) {
					s1.push(temp.right);
				}
				if (temp.left!=null) {
					s1.push(temp.left);
				}
			}
		}

	}

}
