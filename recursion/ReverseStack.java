package recursion;

import java.util.Stack;

public class ReverseStack {
	
	public static void insertAtBottom(Stack<Integer> s, int data) {
		s.push(data);
	}
	
	public static void reverseIt(Stack<Integer> s) {
		if (!s.isEmpty()) {
			int data = s.pop();
			
			reverseIt(s);
			
			insertAtBottom(s,data);
		}
	}

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		
		for (int i = 0; i < 9; i++) {
			System.out.print(st.pop()+" ");
		}
		
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		
		reverseIt(st);
		System.out.println();
		for (int i = 0; i < 9; i++) {
			System.out.println(st.pop()+" ");
		}

	}

}
