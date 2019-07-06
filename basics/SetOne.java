package basics;

public class SetOne {
	
	static boolean isPrime(int no){
        if (no == 2 || no == 3)
            return true;
        else if (no == 1 || no%2 == 0)
            return false;
        
        for (int i = 3; i <= (int)Math.sqrt(no); i+=2){
            if (no % i == 0)
                return false;
        }
        return true;
    }
	
	static boolean isPalindrome(String str) {
		
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i))
				return false;
		}
		
		return true;
	}
	
	static int[] fibonacii(int a, int b, int n) {
		int arr[] = new int[n];
		arr[0] = a;
		arr[1] = b;
		
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr;		
	}

	public static void main(String[] args) {
//		-------------------------------------------Fibonacci--------------------------------------------
//		int n = 10;
//		int a = 3,b=4;
//		int c;
//		System.out.println(a);
//		System.out.println(b);
//		for (int i = 2; i<n; i++) {
//			c = a + b;
//			a = b;
//			b = c;
//			System.out.print(c+"\n");
//		}
//		=====================================================================================
//		------------------------------------------Prime Number-------------------------------
		
//		static boolean isPrime(int no){
//        if (no == 2 || no == 3)
//            return true;
//        else if (no == 1 || no%2 == 0)
//            return false;
//        
//        for (int i = 3; i <= (int)Math.sqrt(no); i+=2){
//            if (no % i == 0)
//                return false;
//        }
//        return true;
//    	}
//		======================================================================================
//		---------------------------------------String Palindrome------------------------------
		
//		String s1 = "chaman";
//		char c[] = new char[s1.length()];
//		for (int i = 0; i<s1.length(); i++) {
//			c[i] = s1.charAt(s1.length() - i - 1);
//		}
//		System.out.println(new String(c));
//		=====================================================================================
//		-------------------------------------Integer Palindrome------------------------------
		
//		int a = 1221;
//		int n = a;
//		int rev = 0;
//		while ( n > 0 ) {
//			rev = rev*10 + n % 10;
//			n = n/10;
//		}
//		if(a==rev)
//			System.out.println("Palindrome");
//		else
//			System.out.println("Not Palindrome");
//		=====================================================================================
//		----------------------------Palindrome-----------------------------------------------
		
		int a = 32123;
//		String str = Integer.toString(a);
//		System.out.println(str);
		boolean flag = true;
		char arr[] = Integer.toString(a).toCharArray();
		for(int i =0; i<=(arr.length)/2;i++) {
			if (arr[i]==arr[arr.length-1]) {
				flag = true;
			}
			else 
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag);
		
//		HashMap<Integer, Integer> hm = new HashMap<>();
//		
//		hm.put(1, 1);
//		hm.containsKey(2);
		
/*		for i = 0
 * 				a[0] , a[4]
 * 				true
 * 		for i = 1
 * 				a[1] , a[
 *  * */	
		
	}

}
