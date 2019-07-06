package string;
// Reference : Abdul Bari Sir Video
import java.util.Arrays;

/* KMP is a pattern searching algorithm which gives O(m+n) instead of O(m*n) in case of brute force
 * 
 * The basic idea behind KMP’s algorithm is: whenever we detect a mismatch (after some matches), 
 * we already know some of the characters in the text of the next window. 
 * We take advantage of this information to avoid matching the characters that we know will anyway match.
 * 
 * We compare first window of txt with pat
	txt = "AAAAABAAABA" 
	pat = "AAAA"  [Initial position]
	We find a match. This is same as Naive String Matching.
	
	In the next step, we compare next window of txt with pat.
	txt = "AAAAABAAABA" 
	pat =  "AAAA" [Pattern shifted one position]
	This is where KMP does optimization over Naive. In this 
	second window, we only compare fourth A of pattern
	with fourth character of current window of text to decide 
	whether current window matches or not. Since we know 
	first three characters will anyway match, we skipped 
	matching first three characters. 
	
	Need of Preprocessing?
	An important question arises from the above explanation, 
	how to know how many characters to be skipped. To know this, 
	we pre-process pattern and prepare an integer array 
	lps[] that tells us the count of characters to be skipped.
 */

public class KMPAlgo {
	
	// Longest prefix which is also suffix 
	// Ex : ababc (Here ab is longest prefix which is also suffix)
	static void lps (String str, int lps[]) {
		
		int len = 0;                   // For comparison from starting of string
		int i = 1;    // Just for iteration
		
		while (i < str.length()) {
			if (str.charAt(i) == str.charAt(len)) {
				lps[i] = ++len;
				i++;
			}
			else {// Hence coming in else means the CharAt (len) and (i) are'nt same so breaking the sub-pattern
				
				    // If comparison is not with 0th index character then let the len point the lps of previous one
				if (len!=0) {
					len = lps[len-1];      // here we aren't assigning any value to (lps[]) nor we are moving (i) iteration
				}                          // Just updating len so that anyhow matching character is found
				
				else {   // only for case when comparison is with 0th indexed character
					lps[i] = 0;        // here len == 0 hence assign lps for that character be 0 as no match found till 0th index
					i++;
				}
			}
		}
		
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println(Arrays.toString(lps));
	}
	
	static int findFreq(String txt, String pat) {
		
		int m = pat.length();
		int n = txt.length();
		
		int count = 0;
		
		// Preprocess and generate prefix,suffix by gen lps array of the PATTERN string
		int lps[] = new int[m];
		int j = 0;          // Index of pattern
		
		lps(pat,lps);
		
		int  i = 0;
		while(i < n) {
			if (pat.charAt(j) == txt.charAt(i)) {
				j++;
				i++;      // Moving both pattern and text pointers ahead to check 	
			}
			if (j == m) {  // for comparison is fully successful for pattern string length
				System.out.println("Found pattern at index "+(i-j));
				count++;
				j = lps[j-1];
			}
			
			else if (i < n && pat.charAt(j) != txt.charAt(i)) {                 // Hence after j character matches we found a character not matching
				
				if (j != 0)
					j = lps[j-1];                // Just need to check from lps[j-1] now
				else
					i = i+1;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		String str = "AAABACDABACDEBA";
		String pat = "BACDEBA";
		
		System.out.println("Raw String: "+str);
		System.out.println("Frequency of "+pat+" is: "+findFreq(str,pat));

	}

}
