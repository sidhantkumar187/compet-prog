package hackerank;

public class Fibonacci {
//	static public int fib(int n) {
//		if(n==0)
//			return 0;
//		else if (n==1)
//			return 1;
//		else
//			return fib(n-1) + fib(n-2);
//	}
	static public int fib(int n) {
		if(n==0)
			return 0;
		else if (n==1)
			return 1;
		else {
			int a=0,b=1,c=0;
			for (int i=2;i<n;i++) {
				c = a+b;
				a = b;
				b = c;
				}
			return c;
			}
	}
	public static void main(String[] args) {
		int n = 4;  // Finding the nth term of the Fibonacci Series.
		for (int i=1;i<=n;i++) {
			System.out.print(fib(n)+"\t");
		}
	}
}
