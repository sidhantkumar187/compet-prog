package hackerearth;


// Making a Palindrome String given a Shuffled Palindrome string

import java.util.Scanner;

public class MakePalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String: ");
		String any = sc.next();
		sc.close();
		
		int sample[] = new int[256];
		
		for (int i = 0;i<any.length();i++) {
			sample[any.charAt(i)]++;
		}
		
		
		String beg ="",end="",mid="";
		
		for (char c = 'a'; c<='z'; c++) {
			if (sample[c]%2==1) {
				for (int i = 0;i<sample[c];i++) {
					mid = mid + c;
//					or
//					mid = c;
//					sample[c--]--;		Considering it again (by making it even)
					
				}
			}
			else {
				for (int i = 0;i<(sample[c]/2);i++)
					beg = beg + c;
			}
		}
		end = beg;
		String endfin = "";
		
		// Reverse beg to get the end portion
		for (int i = (end.length()/2);i>=0;i--) {
			endfin = endfin + end.charAt(i);
		}
		
		System.out.println("beg: "+beg+" mid: "+mid+" end: "+end);
		System.out.println(end+mid+endfin);
		
	}

}
