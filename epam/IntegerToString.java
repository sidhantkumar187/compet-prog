package epam;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// Another efficient/non-error causing solution will be Only check for Cases Greater than:
// Billion , Million , Thousand.

// Rest can be calculated as base cases conversion for prefix to all above

public class IntegerToString {

	static HashMap<Integer,String> hm = new HashMap<>();
	
	public static void start() {
		hm.put(1,"One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		hm.put(5, "Five");
		hm.put(6, "Six");
		hm.put(7, "Seven");
		hm.put(8, "Eight");
		hm.put(9, "Nine");
		hm.put(0, "Zero");
		
		hm.put(10, "Ten");
		hm.put(20, "Twenty");
		hm.put(30, "Thirty");
		hm.put(40, "Forty");
		hm.put(50, "Fifty");
		hm.put(60, "Sixty");
		hm.put(70, "Seventy");
		hm.put(80, "Eighty");
		hm.put(90, "Ninety");
		
		hm.put(11, "Eleven");
		hm.put(12, "Twelve");
		hm.put(13, "Thirteen");
		hm.put(14, "Forteen");
		hm.put(15, "Fifteen");
		hm.put(16, "Sixteen");
		hm.put(17, "Seventeen");
		hm.put(18, "Eighteen");
		hm.put(19, "Nineteen");
	}
	
	public static String numberToString(int no) {
		
		char num[] = Integer.toString(no).toCharArray();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (char ch : num) {
			q.add(ch-'0');
		}
						
		String str = "";
		
		while (!q.isEmpty()) {
			
			int n = q.size();
			int dig = q.poll();
			
			if (dig == 0) {
				continue;
			}
			
			if (n == 10) {
				str += hm.get(dig*10) +" ";
				if (q.peek() == 0) {
					str += " Billion ";
				}
			}
			else if (n == 9) {
				str += hm.get(dig) + " Billion ";
			}
			else if (n == 8) {
				str += hm.get(dig*10) + " ";
				if (q.peek() == 0) {
					str += " Million ";
				}
			}
			else if (n == 7) {
				str += hm.get(dig) + " Million ";
			}
			else if (n == 6) {
				str += numberToString(dig*100 + q.poll()*10 + q.poll()) + " Thousand "; 
			}
			else if (n == 5) {
				
				if (dig == 1) {
					str += hm.get(dig*10 + q.poll()) + " Thousand ";
				}
				else {
					str += hm.get(dig*10)+" ";
				}
				
			}
			else if (n == 4) {
				str += hm.get(dig) + " Thousand ";
			}
			else if (n == 3) {
				str += hm.get(dig) + " Hundred ";
			}
			else if (n == 2) {
				
				
				if (dig == 1) {
					str += hm.get(dig*10 + q.poll()) + " ";
				}
				else {
					str += hm.get(dig*10) + " ";
				}
			}
			else if (n == 1) {
				str += hm.get(dig);
			}
			
		}
		
		return str;
	}
	
	
	public static void main(String[] args) {
		
		int no = 2030120310;
		
		hm.clear();
		start();
		
		System.out.println(no);
		
		System.out.println(numberToString(no));
		
		
//		int arr[] = new int[10];
//		
//		arr[0] = 1;
//		arr[1] = 0;
//		arr[2] = 2;
//		arr[3] = 4;
//		
//		int arr1[] = Arrays.copyOfRange(arr, 0, 11);
//		
//		int arr2[] = Arrays.copyOf(arr, 4);
//		
//		System.out.println(Arrays.toString(arr1));
//		
//		System.out.println(Arrays.toString(arr2));
//		
//		HashSet<Integer> hs = new HashSet<Integer>();
//		
//		hs.add(20);
//		hs.add(30);
//		
//		Object[] war = hs.toArray();
//		
//		System.out.println(Arrays.toString(war));
//		
//		HashMap<Integer, String> h1 = new HashMap<Integer,String>();

	}

}
