package loops;

public class Practice {
	public static void main(String[] args) {
		int n = 10;
		
		for(int i =0;i<n-1;i++) {
			System.out.print("*");
			for(int col =0;col<n-2;col++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for(int i=0; i<n;i++)
			System.out.print("*");
		
	}
}
