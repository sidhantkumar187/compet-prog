package loops;

public class Pattern {
	public static void main(String[] args) {
		int n = 5;
		/* 
		 * Pattern -----------------
		 *                *
		 *               * *
		 *              * * *
		 *             * * * *
		 *              * * *
		 *               * *
		 *                * 
		 * ---------------------------
		 * */
		for (int rows = 0; rows<n;rows++) {
			// For Spaces ------------as spaces are before star so it's loop must be before star's loop.
			for (int space = 0; space <n-rows-1; space++) {
				System.out.print(" ");
			}
			// For Stars ----------- One space alongwith stars are given so as to indent the pattern clear
			for (int star = 0; star<rows+1; star++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		// Here rows from 1 to n-1 because we don't wanna print the 1st row
		for(int rows = 1;rows<n;rows++) {
			
			for(int spaces = 0; spaces <= rows-1; spaces++ ) {
				System.out.print(" ");
			}
			
			for(int stars = n-1; stars>=rows; stars--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/* For Pattern --------------------
		 * 				*			*
		 * 				*			*
		 * 				*			*
		 * 				*			*
		 * 				*			*
		 * 				*			*
		 * 				*************
		 * --------------------------------
		 * */
		
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
		System.out.println();

//		--------------------------------------------------
		
		for (int i =0;i<5;i++) {
			for (int j =0;j<i;j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		
//		--------------------------------------------------
		/*
		 * 					*
		 * 				   *A*
		 * 				  *A*A*
		 * 				 *A*A*A*
		 * */
//		Method - 1
		
		for(int i = 0;i<n;i++) {
			for (int j = 0;j<n-i;j++) {			// For Spaces
				System.out.print(" ");
			}
			for (int k =0;k<i;k++) {			// For *A as it depends on row(i). i.e Row Number = Number of *A
				System.out.print("*A");
			}
			System.out.print("*");
			System.out.println();
		}
//		Method - 2
		
		for (int i = 0;i<n;i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i+1; k++) {
				
				if (k == 1 || ((k%2)!=0))
					System.out.print("*");
				else
					System.out.print("A");
			}
			System.out.println();
		}
//		Method - 3
		
		System.out.println("Method - 3 ");
		
		for (int i = 0; i<n; i++) {
			for (int j = 0; j <n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <=(2*i); k++) {
				if (k%2==0)
					System.out.print("*");
				else
					System.out.print("A");
			}
			System.out.println();
		}
//		-------------------------------------------------------------------------
		System.out.println();
//		-------------------------------------------------------------------------
		/*
		 *								1
		 *							   232
		 *							  34543
		 *							 4567654
		 *							567898765
		 * */
		
		for(int i = 1; i<=n;i++) {
			for (int space = 1; space <= n-i; space++)
				System.out.print(" ");
			int no = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(no++);
			}
			no = (i-1)*2;
			for(int k = 1; k < i; k++) {
				System.out.print(no--);
			}
			System.out.println();
		}
		
//		-------------------------------------------------------------------
		/*				***** *****
		 * 				****   ****
		 * 				***     ***
		 * 				**       **
		 * 				*         *
		 * 				**       **
		 * 				***     ***
		 * 				****   ****
		 * 				***** *****
		 * 
		 * */
		
		for (int i =0;i<n;i++) {
			for (int j = 0;j<n-i;j++) {
				System.out.print("* ");
			}
			for (int k = 0; k <i; k++) {
				System.out.print(" ");
			}
			System.out.print(" ");
			for (int p = 0; p < i; p++) {
				System.out.print(" ");
			}
			for (int q = 0; q < n-i; q++) {
				System.out.print("*");
				if(q!=n-i-1)
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// Lower Part
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j<=i+1; j++) {
				System.out.print("*");
			}
			for (int k = 0; k<n-i-1; k++) {
				System.out.print(" ");
			}
			for (int p = 0; p <n-i-2;p++) {
				System.out.print(" ");
			}
			for (int q = 0; q <=i+1 ;q++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		----------------------------------------------------
		System.out.println();
//		------------------------------------------------------
		
		/*
		 * 				*         *
		 * 				**       **
		 * 				***     ***
		 * 				****   ****
		 * 				***** *****
		 * 				****   ****
		 * 				***     ***
		 * 				**       **
		 * 				*         *
		 * */
		
//		------------------------------------
		System.out.println();
//		-----------------------------------
		/*
		 * 			1
		 * 		   1 1
		 *        1 2 1
		 *       1 3 3 1
		 * 
		 * */
		for (int i =0;i<n;i++) {
			int no = i;
			for (int space = 0; space < n -i; space++) {
				System.out.print(" ");
			}
			System.out.print("1 ");
			for (int j = 0; j<i-1; j++) {
				System.out.print(no + " ");
			}
			if (i!=0)
				System.out.print("1");
			System.out.println();
		}
//		-------------------------------------------
		/*					1
		 * 				    01
		 * 					101
		 * 					0101
		 * 
		 * */
		
//		for (int i = 1;i<=n;i++) {
//			if(i%2!=0)
//				System.out.print("1");
//			for (int j = 1;j<i-1;j++) {
//				System.out.print("01");
//			}
//			System.out.println();
//		}
		
		for (int i = 1; i<n; i++) {
			
		}
	}
}
