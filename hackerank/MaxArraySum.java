package hackerank;

public class MaxArraySum {

	public static void main(String[] args) {
		
		// We maintain Two variables:
		
		/*
		 * 		include = Maximum sum till here by including current element will be (exclude + are[i])
		 * 
		 * 		exclude = Maximum sum till here by Excluding current element will be max(exclude,include)
		 */
		
		int arr[] = {5, 5, 10, 100, 10, 5};
		
		// Initialize include with are[0] and exclude with 0
		
		int incl = arr[0];
		int excl = 0;
		
		for (int i = 1; i < arr.length; i++) {
			int temp = incl;
			incl = excl + arr[i];
			excl = Math.max(temp, excl);       
		}
		
		System.out.println(Math.max(incl, excl));

	}

}
