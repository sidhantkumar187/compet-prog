package hackerank;

public class DoublyLinkedList <E> {
	Node <E> head;
	Node <E> tail;
	int size = 0;
	static class Node <E>{
		E data;
		Node<E> next;
		Node<E> previous;
	}
	public void insert(E data) {
		Node<E> nayi = new Node<E>();
		nayi.data = data;
		nayi.previous = null;
		nayi.next = null;
		if (this.size == 0) {
			System.out.println("Inserting first node");
			head = nayi;
			tail = nayi;
		}
		else {
			tail.next = nayi;
			nayi.previous = tail;
			tail = nayi;
		}
		this.size++;
	}
	public void show() {
		Node<E> iter = new Node<E>();
		iter = head;
		System.out.println("Printing Data");
		while(iter.next!=null) {
			System.out.println(iter.data);
			iter = iter.next;
		}
		System.out.println(iter.data); 		// Prints data of Last Node
	}
	public boolean remove(E data){
		Node<E> temp = new Node<>();
		temp = this.head;
		if (temp.data.equals(data)) {
			head = head.next;
			head.next.previous = null;
			this.size--;
			return true;
		}
		while (temp.next != null) {
			if (temp.data.equals(data)) {
				temp.previous.next = temp.next;
				temp.next.previous = temp.previous;
				this.size--;
				return true;
			}
			temp = temp.next;
		}
			
		return false;
	}
}
