package hackerank;
/* Program to Detect + Remove Loop in a linked list.
 A loop in linked list is present if some part of the linked list behaves as circular linked list. 
 But not all of the whole Linked-List is circular. i.e tail.next != head. (last node is not pointing towards first node)
*/

/* For Loop detection we use two pointers, ptr1 & ptr2. Traversing through these two pointers (one traverse slow ,
 other one first). So, if there may be a loop then these two will meet at a same node during traversal. Because one is slow
 and other is fast.

 MUST SEE !

 https://youtu.be/_BG9rjkAXj8     -- method 3.
 
 m + k = Multiple of n means -- They 
*/
public class DetectLoop {
	public static <E> void LoopDetectionRemoval(LinkedList<E> list) {
		if (list.head==null) {
			System.out.println("The List is empty");
		}
		LinkedList.Node<E> ptr1 = list.head.next;
		LinkedList.Node<E> ptr2 = list.head.next.next;
		
		while(ptr2!=null && ptr2.next!=null) {
			if(ptr1==ptr2) {
				System.out.println("Loop Detected and Being Removed");
				removeloop(list,ptr2);
			}
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}
		return;
	}
	// Loop is removed by initializing the ptr1 from the head of list & ptr2 from the point where they met. Traversing down in the LinkedList 
	// these ptr1 & ptr2 will be meeting at the point where the loop starts.( Not at any other point inside loop but only at the start )
	// So we have to trap one step before their meet so as to destroy the link.
	public static <E>void removeloop(LinkedList<E> list,LinkedList.Node<E> ptr2) {
		
		LinkedList.Node<E> ptr1 = list.head;
		
		while (ptr1.next!=ptr2.next) {		// Checking if they would be meeting after this step.
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		ptr2.next = null;  // Removing the Last node's next which was causing the Loop
		System.out.println("Loop Removed");
	}
}
