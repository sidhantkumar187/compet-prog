package hackerearth;

public class Factorial {

	public static long[] fact(int a, int b) {
		
		long res[] = {0,0};
		long min_fact, max_fact;
		min_fact = max_fact = 1;
		
		int min = a, max = b;
		
		if (a>b) {
			min = b;
			max = a;
		}
		
		for (int i = 1; i<=min; i++) {
			min_fact*=i;
		}
		
		max_fact = min_fact;
		
		for (int i = min+1; i<=max; i++) {
			max_fact*=i;
		}
		res[0] = max_fact;
		res[1] = min_fact;
		return res;
		
	}
	
	
	public static void main(String[] args) {
		
		long arr[] = fact(5,7);
		
		System.out.println(arr[0]+" "+arr[1]);

		System.out.println(7*6*5*4*3*2*1);
	}

}
