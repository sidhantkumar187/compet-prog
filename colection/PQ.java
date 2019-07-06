package colection;

import java.util.PriorityQueue;

public class PQ {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i = 10; i>=1; i--) {
			pq.add(i);
		}
		
		
		System.out.println("pq: "+pq);
		
		System.out.println(pq.poll());
		
		for (int i = 0; i<11;i++) {
			System.out.println(pq.poll());
		}
//			int a = 0;
//			a = pq.poll();
			
			System.out.println(pq.poll());
	}

}
