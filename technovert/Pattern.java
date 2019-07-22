package technovert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		// Upper Portion
		
		for (int i = 0; i < n; i++) {
			// Left indentation
			for (int sp = 0; sp < i; sp++) {
				System.out.print(" ");
			}
			// Printing Numbers
			for (int out = i+1; out <= n; out++) {
				System.out.print(out+" ");
			}
			System.out.println();
		}
		
		// Lower portion
		
		for (int i = 0; i < n-1; i++) {
			// Left indentaion
			for (int sp = 0; sp < n-i-2; sp++) {
				System.out.print(" ");
			}
			// Printing Numbers
			for (int out = n-i-1; out <= n; out++) {
				System.out.print(out+" ");
			}
			System.out.println();
		}

	}

}
