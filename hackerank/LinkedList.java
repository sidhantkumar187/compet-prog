package hackerank;
// Further Task : Try to use this LinkedList for UserDefined Object's list and then use remove and removeat methods.
public class LinkedList<E> {
	Node<E> head;
	SparseNode<E> shead;
	public int length = 0;
	// Inner class is made static so that main() can access it.
//	Another reason for Static class is such that we can create Node's object by just LinkedList.Node
//	either it can't be possible
/*
 * Node class is made inner(Non-static) so that In Order to instantiate the inner class u must instantiate the outer class
 * i.e to instantiate the Node u need to instantiate the LinkedList before
 * +
 * The inner class if Non-static can access the Private members of the Outer class.
 * 
 * But instance of Static-nested class can be made independent of the Outer class.
 * + 
 * It can't access the data members of outer class using this. keyword because does'nt forces u to create Outer's object.
 * 
 * Just made for better readability and accessibility inside main method.
 * 
 * +
 * 
 * Even the Private members of the Inner class are accessible inside the Outer class
 * Thus cutting the need of Getters and setters (or constructors also)
 * */
	
	/*				Inner Class Advantage:
	 * 					 1) If a class is useful to only one class, it makes sense to keep it nested and together. 
	 * 					 	It helps in the packaging of the classes.
    					 2)	Java inner classes implements encapsulation. Note that inner classes can access outer class 
    					 	private members and at the same time we can hide inner class from outer world.
    					 3)	Keeping the small class within top-level classes places the code closer to where it is used 
    					 	and makes the code more readable and maintainable.
    					 	
    					 	
    				Static Advantage:
    						
    					1)	Static inner class can be instantiated using LinkedList.Node node = new LinkedList.Node(data);
    						(useful when we need to make a node manually)
    					
    					2)  Static inner class can access only static fields of the outer class
    					
    					3)  Outer class can access even the private methods of the Inner class
    						
	 * 										
	 * 
	 * */
	
	static class Node<E> {					// As LinkedList must contain a node which further contains data + next pointing.
		E data;
		Node<E> next;
	}
	static class SparseNode<E>{
		E data;
		int col;
		int row;
		SparseNode<E> next;
	}
	public void insert(E d) { 		// Insertion at the end of the node
		Node<E> node = new Node<E>();
		node.data = d;
		node.next = null;
		
		if (head == null)				// Check if the node is empty then make the head point to inserted node(data)
		{
			head = node;
		}
		else {							// Else traverse to the end of the node and insert at last node by
			Node<E> n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;				// just making the next of the last node to point to inserted new node.
		}
		this.length++;
	}
	public void insertToSparse(E data,int row,int col) {
		SparseNode<E> node = new SparseNode<E>();
		node.data = data;
		node.col = col;
		node.row = row;
		node.next = null;
		
		if (shead == null) {
			shead = node;
		}
		else {
			SparseNode<E> n = shead;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public void insertat(E data,int position) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;
		Node<E> travel = head;
		for (int i=0; i<position - 1; i++ ) {
			travel = travel.next;
		}
		Node<E> temp = travel.next;
		travel.next = node;
		node.next = temp;
		this.length++;
	}
	public boolean remove(E data) {
		
		// If data is present on the Head
		if(head.data.equals(data)) {
			this.length--;
			head.data = null;
			head = head.next;
			return true;
		}
		Node<E> n1 = head;
		Node<E> n2 = head.next;
		// If data is somewhere between the head and tail
		
		while(n2.next!=null) {
			if(n2.data.equals(data)) {
				this.length--;
				n2.data = null;
				n1.next = n2.next;
				return true;
			}
			n1= n1.next;
			n2 = n2.next;
		}
		// Another case needed for the Tail Node Because the above while loop runs till the 2nd last node only.
		// If the data is at the Tail
		if(n2.data.equals(data)) {
			this.length--;
			n2.data = null;
			n1.next = null;
			return true;
		}
		return false;
	}
	public void show() {
		Node<E> n = head.next;
		System.out.println();
		System.out.print(head.data);
		while(n != null) {
			System.out.print("->"+n.data);
			n = n.next;				// Pointing to the next node now.
		}
	}
	public void showSparse(char vert[]) {
		SparseNode<E> s = shead;
		
		while(s!=null) {
			System.out.println(vert[s.row]+"-"+vert[s.col]+": "+s.data);
			s = s.next;
		}
	}
	
	public void deleteAllOcc(E data) {
		
		if (head == null)
			return;
		
		if (head.data == data)
			head = head.next;
		
		Node<E> prev = head;
		Node<E> ptr = head.next;
		
		while(prev.next!=null) {
			if(ptr.data == data && ptr == head) {
				head = head.next;
			}
			else if(ptr.data == data && ptr!=head) {
				prev.next = ptr.next;
			}
			else if(ptr.data == data && ptr.next == null) {
				prev.next = null;
			}
			else {
				prev = ptr;
			}
			ptr = ptr.next;
		}
	}
}
