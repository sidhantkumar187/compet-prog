package points;

/*			-------------------  Ternary Operator ---------------
 * 
 * 				int max = val1 <= val2 ? val1 : val2;
 * 						  condition       if     if
 * 										true    false
 * 
 * */


/* In Java the arguments are always passed by value. Java only supports pass by value. With Java Objects, the OBJECT reference
 * is passed such that the parameter copy and the Object reference both point to the same Object.
 * Conclusion - 
 * 				Changes done to an java object's data are reflected bcoz objects passed by ref.
 * 				But to a variable can't be reflected bcoz passed by value.
 * 
 * ---------------Strings are Immutable in Java----------------------------------
 * 
 * As we know String is an Character array. So, it would be called mutable if we can change the sequence of Characters
 * in the String.
 * But we can't change the sequence. Apart from this we can concatenate it with another string and return the reference
 * of that concatenated string in the same reference (String Object)
 * 
 * -----------------------------Multi-Dimensional Array
 * 			
 * 				suppose array a[][] be 2-D array
 * 				Usually we use it for matrix. So, a[row][col]
 * 				
 * 				To know the length of this 2-D array's row and col  
 *  			use:-
 *  					a[0].length == a[row] ki length
 *  					a[1].length == a[col] ki length
 *  
 *  --------------------------------------------------------------------------------------------
 *  -------------------------------------   == , .equals ---------------------------------------
 *  			
 *  			== ~ for reference comparison ONLY (if ref not equal then would return false)
 *  			
 *  			.equals ~ for content comparison (used in case of objects)
 *  
 *  			Thread t1 = new Thread(); 
				Thread t2 = new Thread(); 
				Thread t3 = t1; 
			
				String s1 = new String("GEEKS"); 
				String s2 = new String("GEEKS"); 
			
				System.out.println(t1 == t3);             // true
				System.out.println(t1 == t2);             // false
			
				System.out.println(t1.equals(t2));        // false
				System.out.println(s1.equals(s2));        // true
				
				System.out.println(s1 == s2);            // FALSE
 *  
 * */











public class Core {
	public static void main(String[] args) {		
	// ---------------------------------------Ternary --------------------------------------------------------
		int val1 = 5, val2 = 6;
		
		int max = val1 <= val2 ? val1 : val2;
		
		System.out.println(max);
		
		String str = (val1 & 1) == 1 ? "Odd" : "Even";
		
		System.out.println(str);
		
	// ------------------------------------------------------------------------------------------------------
		
	}

}
