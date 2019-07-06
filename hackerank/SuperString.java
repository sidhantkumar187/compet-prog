package hackerank;

import java.util.Arrays;

public class SuperString {

	public static void main(String[] args) {

//		String str = "aaabccddd";
//		
//		StringBuffer sb = new StringBuffer();
//		sb.append(str);
//		
//		
//		for (int i = 1; i< sb.length(); i++) {
//			
//			if (sb.charAt(i-1) == sb.charAt(i)) {
//				
//				sb.setCharAt(i-1, ' ');
//				sb.setCharAt(i, ' ');	
//			}
//		}
//		
//		String s = sb.toString().replaceAll(" ", "");
//		
//		System.out.println(s);
		
		String str = "baabc";
		
		char ch[] = str.toCharArray();
		
		int pt = 0;											// pt = 0
		
		for (int i = 1; i < ch.length; i++) {				// i = 0
			
			if (pt>=0 && ch[pt] == ch[i]) {
				ch[pt] = ' ';
				ch[i] = ' ';
				pt--;
			}
			else {
				pt = i;
			}
		}
		
		System.out.println(String.valueOf(ch));
				
		System.out.println(Arrays.toString(ch).substring(1,14));
		
		System.out.println(Integer.toBinaryString(100));
		
		String binstr = Integer.toBinaryString(100);
		
		while(binstr.length() < 8) {
			binstr = "0" + binstr;
		}
		
		System.out.println(binstr);
		
		System.out.println("--------------------------------------------");
		
		for (int i = 0, j = 2; i < 10; i++,j++) {
			System.out.println("i: "+i+" ,j: "+j);
		}

	}

}
