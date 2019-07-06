package ds;


/*	Point to Note:
 * 					inserting element enQueue
 * 					----------------------------  rear = (rear+1)%capacity
 * */
public class Queue {
	private int front;
	private int rear;
	private int size = 0;
	private int capacity;
	private int[] arr;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		rear = -1;
		front = 0;
	}
	
	public boolean isEmpty() {
		if(this.size ==0)
			return true;
		return false;
	}
	
	public int getSize() {
		return size;
	}
	
	public void enQueue(int data) {
		if (this.size == capacity) {
			System.out.println("Queue overflow");
		}
		else {
			arr[++rear] = data;
			size++;
		}
	}
	
	public int deQueue() {
		if (this.isEmpty()) {
			System.out.println("Queue is Empty");
			return 0;
		}	
		size--;
		return arr[front++];
	}
	
}
