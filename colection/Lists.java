package colection;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
//		List instance can be Generic type or no data type

//		But some functions like:  Iteration using for each loop , removeIf will not work as the raw type isn't specified.
		
//		List li = new ArrayList();					// No Data Type is specified here
//		li.add("We are");
//		li.add(23);
//		
//		Iterator itr1 = li.iterator();
//		while(itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
		
		ArrayList<Integer> ligen = new ArrayList<Integer>();
		
		ligen.add(2);
		ligen.add(4);
		ligen.add(7);
		ligen.add(1);
		
		for (Integer temp:ligen) {
			System.out.println(temp);
		}
		
		System.out.println("Print purpose: "+ligen);     // for printing purpose only		
		
		System.out.println(ligen.getClass().getName());
		
		System.out.println(ligen.isEmpty());
		
		ligen.add(2, 444444);
		Iterator<Integer> itr = ligen.iterator();
		
//		Note if we declared an iterator for a ligen. After that if we altered something in that list then:-
//						Iterator will throw the ConcurrentModificationException
//		So better declare iterator for the list immediate to when used.
		
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		ligen.removeIf((Integer temp) -> temp >= 4);				// uses predicate as its argument
//		+ point of removeIf is ------ It has O(N) time complexity but earlier remove has O(N^2) complexity
		
		System.out.println(ligen.contains(4));
		
/*		ArrayList methods:
							add(element)
							add(index,element)           Alike insert method of python
							addAll(Collection c)
							clear()                      Remove all the elements of list
							get(i)                       Fetch the element at ith index
							set(i,value)                 change the value of ith element to specified value
boolean						isEmpty()
int							lastIndexOf(object o)        returns -1 if not empty
boolean                     contains(Object o)           returns true if object is in the list
Element						remove(i)                    removes and returns element at ith place
int                         size()                       

List<E>                     subList(int fromIndex, int toIndex)  returns sublist from to to

void                        trimToSize()                 trim the arraylist instance to size as are the elements in it
*/
	}

}
