package ds;

public class Driver extends Object{
	
	public static void forStack() {
		Stack<String> s = new Stack<String>(10);
		Stack<Integer> s1 = new Stack<Integer>(4);
		
		System.out.println(s.pop());
		System.out.println("Empty: "+s.isEmpty());
		
		s.push("Shanu");
		s.push("Sidhant");
		s.push("Shan");
		s.push("Sid");
		
		s1.push(23);
		s1.push(1230);
		s1.push(30);
		s1.push(4);
		s1.push(1230);
		s1.push(30);
		s1.push(4);
		
		System.out.println("Peeking: "+s.peek());
		System.out.println("Size s1:"+s1.getSize());
		System.out.println(s.pop());
		System.out.println("Size s: "+s.getSize());
		
		System.out.println("s1 size : "+s1.getSize());
	}
	
	public static void forQueue() {
		
		System.out.println("Queue Implementation: ");
		Queue q1 = new Queue(5);
		
		System.out.println(q1.deQueue());
		
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);						//		  0     1   2    3    4    5
		q1.enQueue(50);						//		-------------------------------
		q1.enQueue(60);						//		| 20 | 30 | 40 | 50 | 60 | 70 |
		q1.enQueue(70);						//		-------------------------------
											//		front					   rear
		System.out.println(q1.deQueue());
		System.out.println(q1.deQueue());
		System.out.println(q1.deQueue());
		System.out.println(q1.deQueue());
		System.out.println(q1.deQueue());
		
		System.out.println("Size"+q1.getSize());
											// Now:-
		System.out.println(q1.deQueue());	
											//		  0     1   2    3    4    5
											//		-------------------------------
											//		|    |    |    |    |    |    |
											//		-------------------------------
											//								front rear		(both at 5)
		
		try{
			q1.enQueue(1);
		}
		catch(Exception e) {
			System.out.println("Exception inside Queue implementations\n"+e);
		}
	}
	
	public static void forTree() {
		
		System.out.println("Binary Tree Implementation:");
		BinaryTree bt = new BinaryTree();
													//		 				 5
		bt.insertbs(5);								//					   /   \
		bt.insertbs(3);								//					  /     \
		bt.insertbs(2);								//					 3       7
		bt.insertbs(4);								//				   /   \    /  \
		bt.insertbs(7);								//				  2     4  6    8
		bt.insertbs(6);
		bt.insertbs(8);
		
		bt.postorder();								//				2 4 3 6 8 7 5
		bt.preorder();								//				5 2 3 4 6 7 8 
		bt.inorder();								//				2 3 4 5 6 7 8
		
		bt.levelOrder();
		
		System.out.println("\nNode Count : "+bt.countNodes());
		
//		bt.spiralTraverse();
	}
	
	public static void main(String[] args) {
		
//		forStack();
		
//		forQueue();
		
		forTree();
	}

}
