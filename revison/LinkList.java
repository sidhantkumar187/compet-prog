package revison;

public class LinkList {
	
	Node head;
	int size = 0;
	
	class Node{
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}		
	}
	
	public void insertAtEnd(int data) {
		Node n = new Node(data);
		n.next = null;
		
		if (head == null) {
			head = n;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	
	public boolean remove(int data) {
		if (head.data == data) {
			head = head.next;
			return true;
		}
		Node temp = head.next;
		boolean del = false;
		Node prev = head;
		while(temp.next!=null) {
			if (temp.data == data) {
				prev.next = temp.next;
				del = true;
			}
			prev = temp;
			temp = temp.next;
		}
		if (!del && temp.data == data) {
			prev.next = null;
		}
		return del;		
	}
	
	public void show() {
		Node temp = head;
		if (head == null) {
			System.out.println("Empty list");
			return;
		}
		System.out.println();
		do {
			System.out.print("->"+temp.data);
			temp = temp.next;
		}while(temp!=null);
	}
	
	public static void main(String[] args) {
		LinkList li = new LinkList();
						
		li.insertAtEnd(2);
		li.insertAtEnd(3);
		li.insertAtEnd(4);
		li.insertAtEnd(5);
		li.insertAtEnd(6);
		
		li.remove(2);
		li.remove(3);
		li.remove(6);
		
		li.show();
	}
}
