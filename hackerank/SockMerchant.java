package hackerank;

public class SockMerchant {
	public static void main(String[] args) {
		
		int arr[] = {99,99,3,3,4,6,7,1,3};  // optimize it for {"red","blue","red","white"}
		int arr2[] = new int[100];          // This isn't possible for {10000000,2,3,4}
		
		for (int a : arr){
		    arr2[a]++;
		}
		
		int pairs = 0;
		
		for (int b: arr2){
		    pairs = pairs + b/2;
		}
		
		System.out.println("No of pairs are: ");
		System.out.println(pairs);
	}
}