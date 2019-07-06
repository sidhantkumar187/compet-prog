package basics;

public class Copy {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int arr_ [] = arr;                               // Shallow copy (Copying the reference)
		
		arr_[1] = 10000;
		
		System.out.println("Orginal Array:");
		for (int temp : arr) {
			System.out.print(" "+temp);
		}
		
		System.out.println("\nCopied Array:");
		for (int temp : arr_) {
			System.out.print(" "+temp);
		}
		
		int arr_d[] = arr.clone();                      // Deep Copy (Copying the contents but not the reference) 
		
		arr_d[4] = 2000;
		
		System.out.println("\nOrginal Array:");
		for (int temp : arr) {
			System.out.print(" "+temp);                // Hence after changing no changes are reflected in original array.
		}
		
		System.out.println("\nDeep Copied Array:");
		for (int temp : arr_d) {
			System.out.print(" "+temp);
		}

	}

}

