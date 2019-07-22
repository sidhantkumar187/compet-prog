package colection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ArrList {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Character> li = new ArrayList<>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
				
		char c[] = str.toCharArray();
		
		li.add(c[0]);
//		for (int i = 1; i < str.toCharArray().length; i++) {
//			li.add(c[i]);
//			if (li.get(i-1).charValue() == li.get(i).charValue()) {
////				System.out.println(li.get(i)+"=="+li.get(i-1));
//				li.remove(i-1);
//				li.remove(i);
//			}
//		}
		
		
		int i = 1, j = 1;
		
		while(i < c.length) {
			li.add(c[i]);
			if (li.get(j-1).charValue() == li.get(j).charValue() && j>0) {
				li.remove(j);
				li.remove(j-1);
				j-=2;
			}
			j++;
			i++;
		}
		
		for (char ch : li) {
			System.out.print(ch);
		}
		
//		Character ch1 = new Character('c');
//		
//		Character ch2 = new Character('c');
//		
//		System.out.println(ch1==ch2);
		
		
		bf.close();

	}

}
