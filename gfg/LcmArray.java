package gfg;

import java.util.Arrays;

public class LcmArray {

	public static int gcd(int p , int q) {
		
		while (q != 0) {
			int temp = q;
			q = p%q;
			p = temp;
		}
			
		return p;
	}
	
	public static int lcm(int a, int b) {
		
		return (a*b)/gcd(a,b);
	}
	
	public static void main(String[] args) {

		int arr[] = {2,6};
		
		int x = 6, y = 10;
		
		System.out.println("GCD: "+gcd(x,y));
		System.out.println(Arrays.toString(arr));
		System.out.println("LCM: "+lcm(x,y));
		
		int prev_lcm = 1;
		int lcm = 1;
		
		for (int i = 0; i<arr.length; i++) {
			lcm = lcm(prev_lcm,arr[i]);
			prev_lcm = lcm;
		}
		
		System.out.println(lcm);

	}

}
