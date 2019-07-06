package ds;

public class Stack<E extends Object> {
	
	/*	LIFO (Last In First Out)
	 * 			push() pop() peek() isEmpty() operations on the stack must take only O(1) time.
	 * */
	
//	With Load factor 0.75 and stack size increases to double
	
	int top;
	int max = 0;
	private int size;
	E[] arr;
	public Stack(){}
	
	@SuppressWarnings("unchecked")
	public Stack(int max) {
		top = -1;
		size = 0;
		this.max = max;
		this.arr = (E[]) new Object[this.max];	
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean push(E data) {
		if(this.size > max*0.75) {
			expandStackSize();
		}
		if (top>=this.max-1) {
			return false;
		}
		else {
			arr[++top] = data;
			size++;
			return true;
		}
	}
	
	public void expandStackSize() {
		@SuppressWarnings("unchecked")
		E newarr[] = (E[]) new Object[this.max*2];
		
//			Note: Created an Object array then converted it into the array of E[] type because Array of Generic Data Type
//		is not possible in java.
//		Because while declaring an array in java it acquires some memory space for that type (space depends on data type)
//		So if the Data type is not known prior so an array can't be created.
		
		for (int i = 0;i<this.size;i++) {
			newarr[i] = arr[i];
		}
		arr = newarr;
		max = max*2;
		
	}
	
	public E pop() {
		if (top<0) {
			System.out.println("Stack underflow");
			return null;
		}
		else {
			size--;
			return (arr[top--]);
		}
	}
	
	public E peek() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return null;
		}
		else {
			return arr[top];
		}
	}
	
	public boolean isEmpty() {
		if (top<0)
			return true;
		return false;
	}
}
