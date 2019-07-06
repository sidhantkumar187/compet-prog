package recursion;

/*				 _								 _									   (2,"")
 * 				|1|								|2|									 /        \
 * 			    |_|								|_|									/	       \
 * 																				   /	        \
 * 				 0								00								(1,"0")         (1,"1")
 *               1								01							    /	  \	        /     \
 *               								10							   /       \       /	   \
 *               								11							  /         \     /			\
 *																		(0,"00")   (0,"01")  (0,"10")  (0,"11")
 *
 *    For every choice (0) or (1) initially,
 *    0 and 1 are appended
 *
 *	               
 */

public class BinaryPrint {
	
	public static void printBinary(int digits) {
		printBinaryHelper(digits, "");
	}
	
	public static void printBinaryHelper(int digits, String choices_made) {
		
//		System.out.println("printBinaryHelper("+digits+","+choices_made+")");
		
		if (digits == 0) {								// If digits for which choices to be made is 0. Then we
			System.out.println(choices_made);			// we reached to final result where all the choices made
		}
		else {
			printBinaryHelper(digits - 1 , choices_made + "0");			// Attach 0 with choices made
			printBinaryHelper(digits - 1 , choices_made + "1");			// Attach 1 with choices made
		}
	}
	
	public static void main(String[] args) {

		int digits = 2;
		
		printBinary(digits);

	}

}
