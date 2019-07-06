package gfg_ds;

import java.util.Arrays;

/* Initially front is pointing at 0 index & rear at end (INITIALLY)
 * 
 * rear is Last end to where insertion occurs
 * 
 * After enQueue i.e insertion of element into Queue 
 * 						rear = (rear + 1) % capacity   (this will not lead to full array)
 * 			Simply rear is increased   (no change in front)
 * 
 * front is first element 
 * 
 * After deQueue i.e deletion of element that was inserted first
 * 									front = (front + 1) % capacity
 * As item is deleted so front will point to second inserted element
 *  
 * 
 * */

public class Queue {
	
	int front, rear, size;
	int capacity = 0;
	int arr[];
	
	public Queue(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = 0;
		rear = capacity - 1;
	}
	
	public boolean isEmpty() {
		return this.size <= 0 ? true : false;
	}
	
	public boolean isFull() {
		return this.size >= this.capacity ? true : false; 
	}
	
	public boolean enQueue(int item) {
		if(this.isFull()) {
			System.out.println("Queue is Full");
			return false;
		}
		
		this.rear = (this.rear + 1) % capacity;
		arr[this.rear] = item;
		return true;
	}
	
	public int deQueue() {
		size--;
		return arr[this.front];
	}
	
	public void showQueue() {
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr,front,rear+1)));
	}

	public static void main(String[] args) {
		
		Queue q = new Queue(10);
		
		q.enQueue(10);
		q.enQueue(10);
		q.enQueue(10);
		q.enQueue(10);
		q.enQueue(10);
		
		q.showQueue();

	}

}
