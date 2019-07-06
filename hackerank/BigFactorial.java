package hackerank;

/*
 * 				21225                             
 * 			      x99
 * 			_________
 * 			  2101275
 * 			_________				(99*5) = 495
 * 								
 * Solution:              Multiply from left side 99*5. So digit in product at that place would be 99*5 % 10 (i.e 5)
 * 				And carry for next digit product would be 49
 * 
 *  			Next digit is 2 and prod now is 2*99 + carry (i.e 2*99 + 49)
 *  			Next carry is 24 (i.e 24 from 247) 
 */


public class BigFactorial {
	
	static String greatProduct(String no, int mul) {
		
		int n = no.length();
		
		if (n <= 7) {
			return Integer.toString(Integer.parseInt(no)*mul);
		}
		
		int carry = 0;
		char arr[] = no.toCharArray();
		
		for (int i = n-1; i >= 0; i--) {
			
			int prod = (int)(arr[i] - '0');    // Getting the Integer value from character 
			prod *= mul;				//  i.e 5 from '5'
			
			prod += carry;
						
			carry = prod/10;					
			prod = prod%10;
			
			char place = (char)(prod + '0');   // Getting Character value from Integer
			arr[i] = place; 					// '5' from 5
		}
		
		String str = new String(arr);
		
		if (carry!=0) {
			str = Integer.toString(carry) + str;
		}
		
		return str;
	}

	public static void main(String[] args) {
		
		int no = 77;  
		
		// 145183092028285869634070784086308284983740379224208358846781574688061991349156420080065207861248000000000000000000
		
		String prod = "1";
		
		for (int i = no; i >= 2; i--) {
			prod = greatProduct(prod, i);
			System.out.println("prod be : "+prod);
		}
		
		System.out.println(prod);
		System.out.println("---------------------------------");
		System.out.println(1 << 100);
		
//		System.out.println(Integer.toBinaryString(66));
		
		for (int i = 12; i <=99; i++) {
			System.out.println(i+" : "+Integer.toBinaryString(i));
		}
		
		System.out.println(1<<31);
		
		System.out.println((long)Math.pow(2, 31));

	}

}
