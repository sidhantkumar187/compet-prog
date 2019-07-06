package hackerearth;

import ds.Stack;

/*
 * 				Program to Convert Decimal to Binary using Stack
 * 				
 * 				35 (Decimal)
 * 				100011 (Binary)
 * 
 * */
public class DecToBin {

	public static void main(String[] args) {
	
		int no = 16;
		int temp = no;
		
		Stack<Integer> s = new Stack<Integer>(20);
		
		while (temp>0) {
			s.push(temp%2);
			temp = temp / 2;
		}
		
		while(!s.isEmpty()) {
			System.out.print(s.pop());
		}
	}

}
