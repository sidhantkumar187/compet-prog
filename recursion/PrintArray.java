package recursion;

// REFERENCE : https://introcs.cs.princeton.edu/java/23recursion/
// 						(MUST READ) ^

/* While using Recursion keep in mind 3 things:
 *												1)	Terminating Condition of Recursion
 *												2)	Recalling condition and its arguments
 *												3)	Check for Stack Overflow for particular cases
 *
*/
public class PrintArray {
//	------------------------------Print Array without use of Iteration(Loop)-----------------
	static int i =0;
	public static void printArray(int arr[]) {
		if(i == arr.length) {
			return;
		}
		System.out.println(arr[i++]);
		printArray(arr);
	}
//	-------------------or------------------------
	public static void printMyArray(int arr[],int n) {
		if (n != -1) {
			printMyArray(arr,n-1);
			System.out.println(arr[n]);
		}
	}
//	-------------------------- Factorial using Recursion ----------------------
	static int fact = 1;
	public static int factorial(int no) {
		if (no == 1) {
			return 1;
		}
		return no * factorial(no-1);
	}
//	----------------------------- GCD with Recursion --------------------------
	
	public static int gcd(int p,int q) {
		if (q == 0) return p;
		else return gcd(q,p%q);
	}
	
//	------------------------------ GCD without Recursion ------------------------
	public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }
//	------------------------------ Tower of Hanoi --------------------------
	public static void moves(int n, boolean left) {
        if (n == 0) return;
        moves(n-1, !left);
        if (left) System.out.println((n + " left"));
        else      System.out.println((n + " right"));
        moves(n-1, !left);
    }
	
//	----------------------------------- TO DO ------------------------
//	Printing Data of tree using recursion
	
	public static void main(String[] args) {
		int arr[] = {2,4,6,2,3,4,1};
		
//		printArray(arr);
		
		printMyArray(arr,arr.length-1);
		System.out.println("Factorial: "+factorial(5));
		moves(3,true);
		System.out.println("GCD : "+gcd(196,144));
	}

}
