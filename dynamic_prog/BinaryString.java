package dynamic_prog;

/* Given a positive integer N, count all possible distinct binary strings of length N 
 * such that there are no consecutive 1’s. Output your answer mod 10^9 + 7.
 * 
 *  Input:
	2
	3
	2
	
	Output:
	5
	3
	
	Explanation:
	Testcase 1: case 5 strings are (000, 001, 010, 100, 101)
	Testcse 2:  case 3 strings are (00,01,10)
 * 
 * */

import java.util.Scanner;

class BinaryString {
    
    static long f[] = new long[101];
    static final int mod = 1000000007;
	public static void main (String[] args) {

		// 
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();		// As we know for n = 1,2 ~Binary strings possible are
		f[1] = 2;					//  0,1
		f[2] = 3;					// 00, 01, 10 
		while(t>0){
		    t--;
		    int n = sc.nextInt();
		    long ans = cal(n);
		    System.out.println(ans);
		}
		
		sc.close();
	}
	
	public static long cal(int n){
	    
	    if(f[n]==0){
    	   f[n]=(cal(n-1)%mod+cal(n-2)%mod)%mod;
	    }
	    return f[n];
	}
}
