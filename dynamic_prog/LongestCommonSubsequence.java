package dynamic_prog;

import java.util.Arrays;

//https://www.geeksforgeeks.org/printing-longest-common-subsequence/

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		
		String str1 = "AGGTAB";
		String str2 = "GXTXAYB";
		
		char a[] = str1.toCharArray();
		char b[] = str2.toCharArray();
		
		int m = a.length;
		int n = b.length;
		
		int lcs[][] = new int[m+1][n+1];        // remember lcs table is of size one greater than m*n
		
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				
				if (i == 0 || j == 0)			// base case
					lcs[i][j] = 0;
				
				else if (a[i-1] == b[j-1])		// if character matches then 1 + diagonal
					lcs[i][j] = lcs[i-1][j-1] + 1;
				
				else
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);	   // char doesn't match so select max from (up, left)
			}
		}
		
		System.out.println("Length of Longest common Subsequence is : "+lcs[m][n]);
		
		printSequence(lcs,a,b);

	}
	
	static void printSequence(int[][] lcs, char a[], char b[]) {
		int m = a.length;
		int n = b.length;
		
		int sub_len = lcs[m][n];          // As length of subsequence is given by bottom right corner
		
		char res[] = new char[sub_len];
		
		int i = m;
		int j = n;							// starting from the bottom right
		
		while (i > 0 && j > 0) {            // While we didn't hit either of the boundary
			
			if (a[i-1] == b[j-1]) {         // if char are similar then add this char to resultant_subsequence
				res[--sub_len] = a[i-1];
				i--;						// then move diagonally leftwards
				j--;
			}
			else if (lcs[i-1][j] > lcs[i][j-1])
				i--;									// if upside lcs is greater then go upside
			else
				j--;									// else go leftwards
		}
		
		System.out.println("Raw Strings:\n"+Arrays.toString(a)+"  "+Arrays.toString(b));
		
		System.out.println("Resultant Susequence : "+Arrays.toString(res));
	}

}
