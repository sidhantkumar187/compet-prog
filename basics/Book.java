package basics;

import java.util.Arrays;

// Reference : Java Complete Reference Hebert Schildt (F:\7th-Sem\Herbert Schildt-Java_ The Complete Reference-McGraw-Hill Education (2017).pdf)

/*    The scope of a nested class is bounded by the scope of its enclosing class.
 * 	  if class B is defined within class A, then B does not exist independently of A
 * 
 */


public class Book {
	
	
//---------Varargs argument must be only one and must be at Last position in argument list--------
	
	public static void printAll(int[] ...arg) {
		System.out.println("Called Varargs");
		for (int [] i : arg) {
			System.out.println(Arrays.toString(i));
		}
	}

	public static void main(String[] args) {
		
		int[] arr1, arr2, arr3;
		
		arr1 = new int[5];
		arr2 = new int[6];
		arr3 = new int[7];
		
		printAll(arr1,arr2,arr3);
		printAll(arr1,arr2);
		printAll();

	}

}
