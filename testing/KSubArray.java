package testing;

public class KSubArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int mul[] = new int[arr.length];
		mul[0] = arr[0];
		
		int k = 10;
		int count = 0;
		
		for(int i = 1; i < arr.length; i++) {
			mul[i] = mul[i-1] * arr[i];
			if (arr[i] < k)
				count++;
		}
		
		for (int len = 2; len < arr.length; len++) {
			for(int i = 0; i+len-1 < arr.length; i++){
				if (i == 0 && mul[i+len-1] < k) {
					count++;
				}
				else if (i>0 && (mul[i+len-1]/mul[i]) <k) {
					count++;
				}
			}
		}
		
		System.out.println(count);

	}

}
