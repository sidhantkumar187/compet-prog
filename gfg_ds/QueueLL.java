package gfg_ds;

// Don't think about size check using front or rear because for it we would be maintaining size variable

/*     Queue implementation using LinkedList:
 * 
 * 			front initially points to an empty node but not null and rear also
 * 
 * 			Whenever data is inserted into the list then rear's node's data is assigned and hence moved to a new empty node
 * 
 * */
class QueueLinkedList{
	QNode front = new QNode();
	QNode rear = front;
	private int size;
	
	class QNode{
		QNode next;
		int data;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void enqueue(int data) {
		QNode node = new QNode();
		rear.data = data;
		rear.next = node;
		rear = node;
		size++;
	}
	
	public int deQueue() {
		size--;
		if (this.isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		int data = front.data;
		if (this.size == 1) {
			front.data = -1;
			return data;
		}
		front = front.next;
		return data;
	}
	
	public void show() {
		QNode temp = front;
		while(temp.next!=rear) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}

public class QueueLL {
	

	public static void main(String[] args) {
		
		QueueLinkedList ql = new QueueLinkedList();
		
		ql.isEmpty();
		
		ql.enqueue(10);
		ql.deQueue();
		ql.show();
		ql.enqueue(20);
		ql.enqueue(30);
		ql.enqueue(40);
		ql.enqueue(50);
		
		ql.show();
		
		ql.deQueue();
		ql.deQueue();
		ql.deQueue();
		ql.deQueue();
		ql.deQueue();
		ql.deQueue();

	}

}
