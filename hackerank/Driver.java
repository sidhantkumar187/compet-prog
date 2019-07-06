package hackerank;

//import java.util.Scanner;

public class Driver {
	
	
	
	
	public static int addInts(int...is) {
		int sum = 0;
		is[0] = 45;
		System.out.println("\n"+is[0]+" "+is[1]+" "+is[3]);
		for (int x : is)
			sum += x;
		return sum;
	}

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(1);
		list.insert(4);
		list.insert(5);
		list.insert(4);
		list.insert(4);
		list.insert(1);
		
		list.show();
		System.out.println("\nDeleting 1");
		list.deleteAllOcc(1);
		list.show();
		System.out.println("\nDeleting 4");
		list.deleteAllOcc(4);
		list.show();
		list.remove(5);
		list.show();
//		LinkedList list2 = new LinkedList();
//		list2.insert(1);
//		list2.insert(2);
//		list2.insert(3);
		
//		list.insertat(36, 2);
//		System.out.println("--------------------------");
//		list.show();
//		
//		list2.show();
//		System.out.println("List2's length: "+list2.length);
//		System.out.println("List's Length: "+list.length);
//		System.out.println("Detecting the Loops");
//		
//		DetectLoop.LoopDetectionRemoval(list);
//		System.out.println("No loops now");
//		
//		System.out.println("Enter the data to be removed");
//		Scanner sc = new Scanner(System.in);
//		String item = sc.next();
//		boolean result = false;
//		result = list.remove(item);
//		System.out.println(result);
//		sc.close();
//		list.show();
//		System.out.println(list.length);
		
//		DoublyLinkedList<String> lis = new DoublyLinkedList<>();
//		
//		lis.insert("Data1");
//		lis.insert("Data2");
//		
//		lis.show();
//		
//		System.out.println("Enter the Data to Remove: ");
//		
//		Scanner sc = new Scanner(System.in);
//		String toremove = sc.next();
//		
//		if(lis.remove(toremove))
//			lis.show();
//		
//		sc.close();
		
		System.out.println("\n"+Driver.addInts(1,2,3,4));
		
		
	}

}
